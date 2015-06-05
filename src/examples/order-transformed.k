package examples.order

class Event {
  t : Real
}

class Scheduler {

  power_on : Event
  pick_boot_image : Event
  establish_clock : Event
  boot : Event
  evr_service_start : Event
  init_evr : Event
  power_on_star_sensor : Event
  mount_flash : Event
  power_on_navigation : Event
  power_off_cameras : Event

  req power_on.t < power_off_cameras.t
  req power_off_cameras.t < pick_boot_image.t
  req pick_boot_image.t < boot.t 
  req pick_boot_image.t < power_on_star_sensor.t
  req boot.t < establish_clock.t
  req power_on_star_sensor.t < establish_clock.t
  req establish_clock.t < init_evr.t 
  req init_evr.t < evr_service_start.t
  req establish_clock.t < mount_flash.t
  req mount_flash.t < power_on_navigation.t  
  
  ======================================================
  We cannot support mounting the flash and initializing 
  the evr at the same time. So we disallow it.
  
  req init_evr.t != mount_flash.t
  ======================================================
  
  ======================================================
  Jack thought that for some reason the star sensor and 
  the navigation system should turn on at the same time. 
  Turns out that in this case, the schedule is not possible.
  
  req power_on_navigation.t = power_on_star_sensor.t
  ======================================================
}