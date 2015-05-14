package examples.order

class <event> Event {
  t : Real
}

event power_on
event pick_boot_image
event establish_clock
event boot
event evr_service_start
event init_evr
event power_on_star_sensor
event mount_flash
event power_on_navigation
event power_off_cameras

class Scheduler {

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