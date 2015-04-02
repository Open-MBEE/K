require 'STAKR.rb'

Start()
SetLogFile("D-65303Log.txt")
Write("Session information:")
DisplaySessionInfo()
Write("The test will now begin")

#Test Case A
Write("Verifying default settings...")
dmx0001=VerifyEHACritical("DMX-0001==DSDST") 
dmx0002=VerifyEHACritical("DMX-0002==50000") 
dmx0301=VerifyEHACritical("DMX-0301")
dmx0302=VerifyEHACritical("DMX-0302") 
dmx1527=VerifyEHACritical("DMX-1527==0")
dmx1500=VerifyEHACritical("DMX-1500") 
dmx1501=VerifyEHACritical("DMX-1501") 
dmx1502=VerifyEHACritical("DMX-1502") 
dmx1503=VerifyEHACritical("DMX-1503") 
dmx1504=VerifyEHACritical("DMX-1504") 
dmx1505=VerifyEHACritical("DMX-1505")
Write("Ring buffer count at initialization verified")

dmx0400=VerifyEHACritical("DMX-0400==FLOWING") 
dmx0402=VerifyEHACritical("DMX-0402==0")
dmx0403=VerifyEHACritical("DMX-0403==0") 
dmx0401=VerifyEHACritical("DMX-0401") 
dmx1507=VerifyEHACritical("DMX-1507==0")
dmx1508=VerifyEHACritical("DMX-1508")
if (VerifyEHA("DMX-1508")==VerifyEHA("DMX-0401"))
 #do nothing
else
  Exit()
end
Write("EVR_FATAL statistics verified")

dmx0425=VerifyEHACritical("DMX-0425==FLOWING")
dmx0427=VerifyEHACritical("DMX-0427==0")
dmx0428=VerifyEHACritical("DMX-0428==5")
dmx0426=VerifyEHACritical("DMX-0426")
Write("RT_EHA statistics verified")

dmx0405=VerifyEHACritical("DMX-0405==FLOWING")
dmx0407=VerifyEHACritical("DMX-0407==0")
dmx0408=VerifyEHACritical("DMX-0408==1")
dmx0406=VerifyEHACritical("DMX-0406")
dmx1509=VerifyEHACritical("DMX-1509==0") 
dmx1510=VerifyEHACritical("DMX-1510==0")
dmx1511=VerifyEHACritical("DMX-1511")
if (VerifyEHA("DMX-1511")==VerifyEHA("DMX-0411"))
  # do nothing
else
  Exit()
end
Write("EVR_WRN_HI statistics verified")

dmx0410=VerifyEHACritical("DMX-0410==FLOWING")
dmx0412=VerifyEHACritical("DMX-0412==0")
dmx0413=VerifyEHACritical("DMX-0413==2")
dmx0411=VerifyEHACritical("DMX-0411")
dmx1512=VerifyEHACritical("DMX-1512==0")
dmx1513=VerifyEHACritical("DMX-1513==0")
dmx1514=VerifyEHACritical("DMX-1514")
if (VerifyEHA("DMX-1514") == VerifyEHA("DMX-0416"))
  # do nothing
else
  Exit()
end
Write("EVR_WARNING_LO statistics verified")

dmx0415=VerifyEHACritical("DMX-0415==FLOWING")
dmx0417=VerifyEHACritical("DMX-0417==0")
dmx0418=VerifyEHACritical("DMX-0418==3")
dmx0416=VerifyEHACritical("DMX-0416")
dmx1521=VerifyEHACritical("DMX-1521==0")
dmx1522=VerifyEHACritical("DMX-1522==0")
dmx1523=VerifyEHACritical("DMX-1523")
if (VerifyEHA("DMX-1523")== VerifyEHA("DMX-0421"))
  #do nothing
else
  Exit()
end
Write("EVR_CMD statistics verified")

dmx0420=VerifyEHACritical("DMX-0420==FLOWING") 
dmx0422=VerifyEHACritical("DMX-0422==0")
dmx0423=VerifyEHACritical("DMX-0423==4") 
dmx0421=VerifyEHACritical("DMX-0421")
dmx1515=VerifyEHACritical("DMX-1515==0") 
dmx1516=VerifyEHACritical("DMX-1516==0")
dmx1517=VerifyEHACritical("DMX-1517")
if (VerifyEHA("DMX-1517")==VerifyEHA("DMX-0426"))
  #do nothing
else
  Exit()
end
Write("EVR_ACT_HI statistics verified")

dmx0430=VerifyEHACritical("DMX-0430==FLOWING")
dmx0432=VerifyEHACritical("DMX-0432==0") 
dmx0433=VerifyEHACritical("DMX-0433==6")
dmx0431=VerifyEHACritical("DMX-0431")
dmx1518=VerifyEHACritical("DMX-1518==0") 
dmx1519=VerifyEHACritical("DMX-1519==0")
dmx1520=VerifyEHACritical("DMX-1520")
if (VerifyEHA("DMX-1520")==VerifyEHA("DMX-0431"))
  #do nothing
else
  Exit()
end
Write("EVR_ACT_LO statistics verified")

dmx0435=VerifyEHACritical("DMX-0435==FLOWING") 
dmx0437=VerifyEHACritical("DMX-0437==0")
dmx0438=VerifyEHACritical("DMX-0438==7") 
dmx0436=VerifyEHACritical("DMX-0436")
dmx1524=VerifyEHACritical("DMX-1524==0")
dmx1525=VerifyEHACritical("DMX-1525==0")
dmx1526=VerifyEHACritical("DMX-1526")
if (VerifyEHA("DMX-1526")== VerifyEHA("DMX-0436"))
  #do nothing
else
  Exit()
end
Write("EVR_DIAG statistics verified")

dmx0445=VerifyEHACritical("DMX-0445==FLOWING")
dmx0447=VerifyEHACritical("DMX-0447==0")
dmx0448=VerifyEHACritical("DMX-0448==8") 
dmx0446=VerifyEHACritical("DMX-0446")
Write("EVR_DP statistics verified")

Write("All default settings verified")
SignOff()


Write("Dumping default values of the EVR_FATAL_RT packet buffer")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_FATAL_RT")
dpFile=''
dpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{dpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_FATAL_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==1","service_priority==0", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
 end

Write("Dumping default values of the EVR_WARN_HI_RT packet buffer")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR__WARN_HI_RT")
dpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{dpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_WARN_HI_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==1","service_priority==1", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
 end

Write("Dumping default values of the EVR_WARN_LO_RT packet buffer")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_WARN_LO_RT_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_WARN_LO_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==1","service_priority==2", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
 end

Write("Dumping default values of the EVR_CMD_RT packet buffer")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_CMD_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_CMD_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==1","service_priority==3", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
 end

Write("Dumping default values of the EVR_ACT_HI_RT packet buffer")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_ACT_HI_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_ACT_HI_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==1","service_priority==4", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
 end

Write("Dumping default values of the EHA_TLM_RT packet buffer")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EHA_TLM_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EHA_TLM_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==1","service_priority==5", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
 end

Write("Dumping default values of the EVR_ACT_LO_RT packet buffer")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_ACT_LO_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_ACT_LO_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==1","service_priority==6", "layout==DWN_RT_RING_TYPE",
	"limit==200","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
 end

Write("Dumping default values of the EVR_DIAG_RT packet buffer")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_DIAG_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_DIAG_RT","boot_counter==3",
	"Group_Set_Count_Value_pktbuf==1","service_priority==7", "layout==DWN_RT_RING_TYPE",
	"limit==200","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
 end
 
Write("Dumping default values of the RECORDED_DP packet buffer")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,RECORDED_DP")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_RECORDED_DP","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==1","service_priority==8", "layout==DWN_DP_FIFO_TYPE",
	"limit==0","enabled==True","type==DWN_PB_RECORDED")
  Write("Data Product parameters verified")
 end
 
Write("Closing all packet u=buffer exit gates...")
Send("DMX_DWN_SET_PKTBUF_GATES,ALL,OPENED,CLOSED")
SignOff()

Write("Generating a Data Product...")
Send("DMX_EHA_PRM_DMP,17")
SignOff()

Write("Resetting RIMU LCC Switch Monitor to generate an Activity Lo EVR")
Send("SFP_MONITOR_RESET,MON_SWITCH_MISCOMPARE_RUMU_A_SW_A") #Command doesnt exist in current wsts version
SignOff()

Write("Generating an Activity Hi EVR")
Send("HDW_UPL_SELECT_NORMAL")
SignOff()

Write("Injecting fault to generate Warning Lo Evrs...")
=begin
#INSERT FAULT INJECTION 5-31
=end
Write("Please use command builder fault injection tool to do step 5-31. press enter to continue...")
Pause()
SignOff()

Write("Turning on RIMU LCC to generate Warning Hi EVR...")
Send("SFP_MONITOR_RESET,MON_SWITCH_MISCOMPARE_RUMU_A_SW_A")
Send("PWR_UTIL_TEST,SWITCH,533,534,0,1")
sleep 30.seconds
Write("Opening all packet buffer exit gates...")
Send("DMX_DWN_SET_PKTBUF_GATES,ALL,OPENED,OPENED")
SignOff()
current_clk=$curr_sclk #creating a clock variable to check the correct order
Write("Verifying the EVRs were received in the correct order...")
VerifyEVRCritical("FBM_EVR_MONITOR_ANNOUNCE",$curr_sclk)
current_clk=$curr_sclk
VerifyEVRCritical("UPL_EVR_PROD_UNCORRERR_IN_CODEBLK",current_clk)
VerifyEVRCritical("UPL_EVR_PRODUCT_REJECTED",current_clk)
VerifyEVRCritical("PWR_EVR_UNEXPECTED_SWITCH_ON",current_clk)
current_clk=$curr_sclk
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH",current_clk)
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH",current_clk)
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH",current_clk)
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS",current_clk)
VerifyEVRCritical("CMD_EVR_VC0_COMMAND_DISPATCH",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH",current_clk)
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH",current_clk)
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS",current_clk)
VerifyEVRCritical("CRCMGR_EVR_GROUND_CMD_EXECUTED",$curr_sclk)
VerifyEVRCritical("SCLK_Seconds",$curr_sclk)
VerifyEVRCritical("FBM_EVR_MONITOR_RESET",$curr_sclk)
current_clk=$curr_sclk
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED",current_clk)
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED",current_clk)
VerifyEVRCritical("PIE_EVR_DMP_PREPARATION_NO_CONSOLE",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_DP",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_COMPLETE",current_clk)
VerifyEVRCritical("PDP_EVR_PKT_COMPLETE",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_DPOS",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_COMPLETE",current_clk)
VerifyEVRCritical("PDP_EVR_PKT_COMPLETE",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_END",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_COMPLETE",current_clk)
VerifyEVRCritical("PDP_EVR_PKT_COMPLETE",current_clk)
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED",current_clk)
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY",current_clk)
VerifyEVRCritical("UPL_EVR_PRODUCT_STATUS_NOT_COMPLETE_FRAME",current_clk)
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED",current_clk)
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED",current_clk)

current_clk=$curr_sclk
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH",current_clk)
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS",current_clk)
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED",current_clk)
current_clk=$curr_sclk
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH",current_clk)
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS",current_clk)
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED",current_clk)
VerifyEVRCritical("PIE_EVR_DMP_PREPARATION_NO_CONSOLE",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_DP",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_COMPLETE",current_clk)
VerifyEVRCritical("PDP_EVR_PKT_COMPLETE",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_DPOS",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_COMPLETE",current_clk)
VerifyEVRCritical("PDP_EVR_PKT_COMPLETE",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_END",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_COMPLETE",current_clk)
VerifyEVRCritical("PDP_EVR_PKT_COMPLETE",current_clk)
current_clk=$curr_sclk
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH",current_clk) 
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS",current_clk)
VerifyEVRCritical("FBM_EVR_MONITOR_RESET",current_clk)
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED",current_clk)
current_clk=$curr_sclk
VerifyEVRCritical("CMD_EVR_VC0_COMMAND_DISPATCH",current_clk)
VerifyEVRCritical("CRCMGR_EVR_GROUND_CMD_EXECUTED",current_clk)
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY",current_clk)
current_clk=$curr_sclk
VerifyEVRCritical("UPL_EVR_PROD_UNCORRERR_IN_CODEBLK",current_clk)
VerifyEVRCritical("UPL_EVR_PRODUCT_REJECTED",current_clk)
VerifyEVRCritical("UPL_EVR_PRODUCT_STATUS_NOT_COMPLETE_FRAME",current_clk)
current_clk=$curr_sclk
VerifyEVRCritical("FBM_EVR_MONITOR_ANNOUNCE",current_clk)
VerifyEVRCritical("PWR_EVR_UNEXPECTED_SWITCH_ON",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH",current_clk)
VerifyEVRCritical("CCMD_EVR_CMD_COMPLETED_SUCCESS",current_clk)
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED",current_clk)
current_clk=$curr_sclk
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH",current_clk)
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS",current_clk)
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED",current_clk)
SignOff()


Write("Verifying telemetry channels...")
 
dmx0002=VerifyEHACritical("DMX-0002==50000") 
dmx0301=VerifyEHACritical("DMX-0301")
dmx0302=VerifyEHACritical("DMX-0302") 
dmx1527=VerifyEHACritical("DMX-1527==0")
dmx1500=VerifyEHACritical("DMX-1500==#{dmx1500}") 
dmx1501=VerifyEHACritical("DMX-1501==#{dmx1501}") 
dmx1502=VerifyEHACritical("DMX-1502==#{dmx1502}") 
dmx1503=VerifyEHACritical("DMX-1503==#{dmx1503}") 
dmx1504=VerifyEHACritical("DMX-1504==#{dmx1504}") 
dmx1505=VerifyEHACritical("DMX-1505==#{dmx1505}")
Write("Ring buffer count at initialization verified")

dmx0400=VerifyEHACritical("DMX-0400==FLOWING") 
dmx0402=VerifyEHACritical("DMX-0402==#{dmx0402}")
dmx0403=VerifyEHACritical("DMX-0403==0") 
dmx0401=VerifyEHACritical("DMX-0401==#{dmx0401}") 
dmx1507=VerifyEHACritical("DMX-1507==#{dmx1507}")
dmx1508=VerifyEHACritical("DMX-1508==#{dmx1508}")

Write("EVR_FATAL statistics verified")

dmx0427=VerifyEHACritical("DMX-0427==0")
dmx0426=VerifyEHACritical("DMX-0426")
Write("RT_EHA statistics verified")

dmx0407=VerifyEHACritical("DMX-0407==#{dmx0407}")
dmx0406=VerifyEHACritical("DMX-0406==#{dmx0406+1}")
dmx1510=VerifyEHACritical("DMX-1510==#{dmx1510}")
dmx1511=VerifyEHACritical("DMX-1511==#{dmx1511}")

Write("EVR_WRN_HI statistics verified")

dmx0412=VerifyEHACritical("DMX-0412==#{dmx0412}")
dmx0411=VerifyEHACritical("DMX-0411==#{dmx0411+3}")
dmx1513=VerifyEHACritical("DMX-1513==#{dmx1513}")
dmx1514=VerifyEHACritical("DMX-1514==#{dmx1514+3}")

Write("EVR_WARNING_LO statistics verified")

dmx0417=VerifyEHACritical("DMX-0417==#{dmx0417}")
dmx0416=VerifyEHACritical("DMX-0416==#{dmx0416+11}")
dmx1522=VerifyEHACritical("DMX-1522==#{dmx1522}")
dmx1523=VerifyEHACritical("DMX-1523==#{dmx1523+11}")

Write("EVR_CMD statistics verified")

dmx0422=VerifyEHACritical("DMX-0422==#{dmx0422}")
dmx0421=VerifyEHACritical("DMX-0421==#{dmx0421+1}")
dmx1516=VerifyEHACritical("DMX-1516==#{dmx1516}")
dmx1517=VerifyEHACritical("DMX-1517==#{dmx1517+1}")

Write("EVR_ACT_HI statistics verified")

dmx0432=VerifyEHACritical("DMX-0432==#{dmx0432}") 
dmx0431=VerifyEHACritical("DMX-0431==#{dmx0431+1}")
dmx1519=VerifyEHACritical("DMX-1519==#{dmx1519}")
dmx1520=VerifyEHACritical("DMX-1520==#{dmx1520+1}")

Write("EVR_ACT_LO statistics verified")

dmx0437=VerifyEHACritical("DMX-0437==#{dmx0437}")
dmx0436=VerifyEHACritical("DMX-0436==#{dmx0436+22}")
dmx1525=VerifyEHACritical("DMX-1525==#{dmx1525}")
dmx1526=VerifyEHACritical("DMX-1526==#{dmx1526+22}")

Write("EVR_DIAG statistics verified")

dmx0447=VerifyEHACritical("DMX-0447==#{dmx0447}")
dmx0446=VerifyEHACritical("DMX-0446==#{dmx0446+3}")
Write("EVR_DP statistics verified")

Write("All default settings verified")
SignOff()

Write("Increasing uplink speed...")
Send("udld rcea select_uplink_speed 256000")
Write("Verifying uplink speed...")
if VerifyEHA("SSE1-0501==256000")
  Write("Uplink speed at 256 Kbps")
end
SignOff()

Write("Closing all packet buffer gates...")
Send("DMX_DWN_SET_PKTBUF_GATES,ALL,OPENED,CLOSED")
SignOff()

Send("/proj/msl/testbed/procedures/DwnCmd/procedure2/500plus.txt")
sleep 1.minute

Write("Opening all packet buffer gates...")
Send("DMX_DWN_SET_PKTBUF_GATES,ALL,OPENED,OPENED")


current_clk=$curr_sclk
VerifyEVRCount("WARNING_HI==75",current_clk)
VerifyEVRCount("WARNING_LO==75",current_clk)
VerifyEVRCount("COMMAND==75",current_clk)
VerifyEVRCount("ACTIVITY_HI==75",current_clk)
VerifyEVRCount("ACTIVITY_LO==200",current_clk)
VerifyEVRCount("DIAGNOSTIC==200",current_clk)


Write("Verifying telemetry channels...")
 
dmx0002=VerifyEHACritical("DMX-0002==50000") 
dmx0301=VerifyEHACritical("DMX-0301")
dmx0302=VerifyEHACritical("DMX-0302") 

dmx0427=VerifyEHACritical("DMX-0427")
dmx0426=VerifyEHACritical("DMX-0426")
Write("RT_EHA statistics verified")

dmx0407=VerifyEHACritical("DMX-0407==#{dmx0407+425}")
dmx0406=VerifyEHACritical("DMX-0406==#{dmx0406+500}")
dmx1510=VerifyEHACritical("DMX-1510==#{dmx1510}")
dmx1511=VerifyEHACritical("DMX-1511==#{dmx1511+500}")

Write("EVR_WRN_HI statistics verified")

dmx0412=VerifyEHACritical("DMX-0412==#{dmx0412+425}")
dmx0411=VerifyEHACritical("DMX-0411==#{dmx0411+500}")
dmx1513=VerifyEHACritical("DMX-1513==#{dmx1513}")
dmx1514=VerifyEHACritical("DMX-1514==#{dmx1514+500}")

Write("EVR_WARNING_LO statistics verified")

dmx0417=VerifyEHACritical("DMX-0417==#{dmx0417+2769}")
dmx0416=VerifyEHACritical("DMX-0416==#{dmx0416+2844}")
dmx1522=VerifyEHACritical("DMX-1522==#{dmx1522}")
dmx1523=VerifyEHACritical("DMX-1523==#{dmx1523+2844}")

Write("EVR_CMD statistics verified")

dmx0422=VerifyEHACritical("DMX-0422==#{dmx0422+425}")
dmx0421=VerifyEHACritical("DMX-0421==#{dmx0421+500}")
dmx1516=VerifyEHACritical("DMX-1516==#{dmx1516}")
dmx1517=VerifyEHACritical("DMX-1517==#{dmx1517+500}")

Write("EVR_ACT_HI statistics verified")

dmx0432=VerifyEHACritical("DMX-0432==#{dmx0432+300}") 
dmx0431=VerifyEHACritical("DMX-0431==#{dmx0431+500}")
dmx1519=VerifyEHACritical("DMX-1519==#{dmx1519}")
dmx1520=VerifyEHACritical("DMX-1520==#{dmx1520+500}")

Write("EVR_ACT_LO statistics verified")

dmx0437=VerifyEHACritical("DMX-0437==#{dmx0437+4344}")
dmx0436=VerifyEHACritical("DMX-0436==#{dmx0436+4544}")
dmx1525=VerifyEHACritical("DMX-1525==#{dmx1525}")
dmx1526=VerifyEHACritical("DMX-1526==#{dmx1526+4544}")

Write("EVR_DIAG statistics verified")

dmx0447=VerifyEHACritical("DMX-0447==#{dmx0447}")
dmx0446=VerifyEHACritical("DMX-0446==#{dmx0446+510}")
Write("EVR_DP statistics verified")

Write("All default settings verified")
SignOff()
Write ("Test Activity 1-A: Passed")
SignOff()

#Test Case B

Write("Changing the values of EVR_FATAL_RT...")
Send("DMX_DWN_PKTBUF_SET,EVR_FATAL_RT,7,RT_RING,2,TRUE,REALTIME")

Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0400==FLOWING")
VerifyEHACritical("DMX-0403==7")
VerifyEHACritical("DMX-0428==4")
VerifyEHACritical("DMX-0408==0")
VerifyEHACritical("DMX-0413==1")
VerifyEHACritical("DMX-0418==2")
VerifyEHACritical("DMX-0423==3")
VerifyEHACritical("DMX-0433==5")
VerifyEHACritical("DMX-0438==6")
VerifyEHACritical("DMX-0448==8")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EVR_FATAL_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_FATAL_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_FATAL_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==2","service_priority==7", "layout==DWN_RT_RING_TYPE",
	"limit==2","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product paramters verified")
  SignOff()
 end

Write("Changing the values for EVR_WARNING_HI_RT...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_WARN_HI_RT,6,RT_RING,2,TRUE,REALTIME")

Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0405==FLOWING")
VerifyEHACritical("DMX-0403==7")
VerifyEHACritical("DMX-0428==3")
VerifyEHACritical("DMX-0408==6")
VerifyEHACritical("DMX-0413==0")
VerifyEHACritical("DMX-0418==1")
VerifyEHACritical("DMX-0423==2")
VerifyEHACritical("DMX-0433==4")
VerifyEHACritical("DMX-0438==5")
VerifyEHACritical("DMX-0448==8")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EVR_WARN_HI_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_WARN_HI_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_WARN_HI_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==2","service_priority==6", "layout==DWN_RT_RING_TYPE",
	"limit==2","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product paramters verified")
  SignOff()
 end

 Write("Changing the values for EVR_WARN_LO_RT...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_WARN_LO_RT,5,RT_RING,2,TRUE,REALTIME")

Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0410==FLOWING")
VerifyEHACritical("DMX-0403==7")
VerifyEHACritical("DMX-0428==2")
VerifyEHACritical("DMX-0408==6")
VerifyEHACritical("DMX-0413==5")
VerifyEHACritical("DMX-0418==0")
VerifyEHACritical("DMX-0423==1")
VerifyEHACritical("DMX-0433==3")
VerifyEHACritical("DMX-0438==4")
VerifyEHACritical("DMX-0448==8")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EVR_WARN_LO_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_WARN_LO_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_WARN_LO_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==2","service_priority==5", "layout==DWN_RT_RING_TYPE",
	"limit==2","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product paramters verified")
  SignOff()
 end
 
 
Write("Changing the values for EVR_CMD_RT...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_CMD_RT,4,RT_RING,2,TRUE,REALTIME")

Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0410==FLOWING")
VerifyEHACritical("DMX-0403==7")
VerifyEHACritical("DMX-0428==1")
VerifyEHACritical("DMX-0408==6")
VerifyEHACritical("DMX-0413==5")
VerifyEHACritical("DMX-0418==4")
VerifyEHACritical("DMX-0423==0")
VerifyEHACritical("DMX-0433==2")
VerifyEHACritical("DMX-0438==3")
VerifyEHACritical("DMX-0448==8")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EVR_CMD_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_CMD_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_CMD_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==2","service_priority==4", "layout==DWN_RT_RING_TYPE",
	"limit==2","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end
 
Write("Changing the values for EVR_ACT_HI_RT...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_ACT_HI_RT,3,RT_RING,2,TRUE,REALTIME")

Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0415==FLOWING")
VerifyEHACritical("DMX-0403==7")
VerifyEHACritical("DMX-0428==0")
VerifyEHACritical("DMX-0408==6")
VerifyEHACritical("DMX-0413==5")
VerifyEHACritical("DMX-0418==4")
VerifyEHACritical("DMX-0423==3")
VerifyEHACritical("DMX-0433==1")
VerifyEHACritical("DMX-0438==2")
VerifyEHACritical("DMX-0448==8")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EVR_ACT_HI_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_ACT_HI_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_ACT_HI_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==2","service_priority==3", "layout==DWN_RT_RING_TYPE",
	"limit==2","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end
 
Write("Changing the values for EHA_TLM_RT...")
Send("DMX_DWN_PKTBUF_PRM_SET,EHA_TLM_RT,2,RT_RING,2,TRUE,REALTIME")
Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0425==FLOWING")
VerifyEHACritical("DMX-0403==7")
VerifyEHACritical("DMX-0428==2")
VerifyEHACritical("DMX-0408==6")
VerifyEHACritical("DMX-0413==5")
VerifyEHACritical("DMX-0418==4")
VerifyEHACritical("DMX-0423==3")
VerifyEHACritical("DMX-0433==0")
VerifyEHACritical("DMX-0438==1")
VerifyEHACritical("DMX-0448==8")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EHA_TLM_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EHA_TLM_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EHA_TLM_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==2","service_priority==2", "layout==DWN_RT_RING_TYPE",
	"limit==2","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 
 
Write("Changing the values for EVR_ACT_LO_RT...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_ACT_LO_RT,1,RT_RING,2,TRUE,REALTIME")
Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0430==FLOWING")
VerifyEHACritical("DMX-0403==7")
VerifyEHACritical("DMX-0428==2")
VerifyEHACritical("DMX-0408==6")
VerifyEHACritical("DMX-0413==5")
VerifyEHACritical("DMX-0418==4")
VerifyEHACritical("DMX-0423==3")
VerifyEHACritical("DMX-0433==1")
VerifyEHACritical("DMX-0438==0")
VerifyEHACritical("DMX-0448==8")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EVR_ACT_LO_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_ACT_LO_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_ACT_LO_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==2","service_priority==1", "layout==DWN_RT_RING_TYPE",
	"limit==2","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end  

Write("Changing the values for EVR_DIAG_RT...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_DIAG_RT,4,RT_RING,2,TRUE,REALTIME")
Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0435==FLOWING")
VerifyEHACritical("DMX-0403==7")
VerifyEHACritical("DMX-0428==1")
VerifyEHACritical("DMX-0408==6")
VerifyEHACritical("DMX-0413==5")
VerifyEHACritical("DMX-0418==3")
VerifyEHACritical("DMX-0423==2")
VerifyEHACritical("DMX-0433==0")
VerifyEHACritical("DMX-0438==4")
VerifyEHACritical("DMX-0448==8")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EVR_DIAG_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_DIAG_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_DIAG_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==2","service_priority==4", "layout==DWN_RT_RING_TYPE",
	"limit==2","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 
 
Write("Changing the values for RECORDED_DP...")
Send("DMX_DWN_PKTBUF_PRM_SET,RECORDED_DP,4,RT_RING,2,TRUE,RECORDED")
Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0435==FLOWING")
VerifyEHACritical("DMX-0403==8")
VerifyEHACritical("DMX-0428==2")
VerifyEHACritical("DMX-0408==7")
VerifyEHACritical("DMX-0413==6")
VerifyEHACritical("DMX-0418==4")
VerifyEHACritical("DMX-0423==3")
VerifyEHACritical("DMX-0433==1")
VerifyEHACritical("DMX-0438==5")
VerifyEHACritical("DMX-0448==0")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of RECORDED_DP...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,RECORDED_DP")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_RECORDED_DP","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==2","service_priority==0", "layout==DWN_RT_RING_TYPE",
	"limit==2","enabled==True","type==DWN_PB_RECORDED")
  Write("Data Product parameters verified")
  SignOff()
 end 
 
Write("Increasing uplink speed...")
Send("udld rcea select_uplink_speed 256000")
Write("Verifying uplink speed...")
if VerifyEHA("SSE1-0501==256000")
  Write("Uplink speed at 256 Kbps")
end
SignOff()

Write("Closing all packet buffer gates...")
Send("DMX_DWN_SET_PKTBUF_GATES,ALL,OPENED,CLOSED")
SignOff()

Send("/proj/msl/testbed/procedures/DwnCmd/procedure2/500plus.txt")
sleep 1.minute

Write("Opening all packet buffer gates...")
Send("DMX_DWN_SET_PKTBUF_GATES,ALL,OPENED,OPENED")

Write("Verifying the order of EVRs...")
current_clk=$curr_sclk
VerifyEVRCritical("FBM_EVR_MONITOR_RESET",current_clk)
VerifyEVRCritical("FBM_EVR_MONITOR_RESET",current_clk)
current_clk=$curr_sclk
VerifyEVRCritical("SCLK_Seconds",current_clk)
current_clk=$curr_sclk
VerifyEVRCritical("CRCMGR_EVR_GROUND_CMD_EXECUTED",current_clk)
VerifyEVRCritical("CRCMGR_EVR_GROUND_CMD_EXECUTED",current_clk)
current_clk=$curr_sclk
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH",current_clk)
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS",current_clk)
current_clk=$curr_sclk
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED",current_clk)
current_clk=$curr_sclk
VerifyEVRCritical("PWR_EVR_UNEXPECTED_SWITCH_ON",current_clk)
VerifyEVRCritical("PWR_EVR_UNEXPECTED_SWITCH_ON",current_clk)
current_clk=$curr_sclk
VerifyEVRCritical("FBM_EVR_MONITOR_ANNOUNCE",current_clk)
VerifyEVRCritical("FBM_EVR_MONITOR_ANNOUNCE",current_clk)
Write("Order of EVRs verified")
SignOff()

Write("Verifying telemetry channels...")
 

dmx0427=VerifyEHACritical("DMX-0427")
dmx0426=VerifyEHACritical("DMX-0426")
Write("RT_EHA statistics verified")

dmx0407=VerifyEHACritical("DMX-0407==#{dmx0407+498}")
dmx0406=VerifyEHACritical("DMX-0406==#{dmx0406+500}")
dmx1510=VerifyEHACritical("DMX-1510==#{dmx1510}")
dmx1511=VerifyEHACritical("DMX-1511==#{dmx1511+500}")

Write("EVR_WRN_HI statistics verified")

dmx0412=VerifyEHACritical("DMX-0412==#{dmx0412+498}")
dmx0411=VerifyEHACritical("DMX-0411==#{dmx0411+500}")
dmx1513=VerifyEHACritical("DMX-1513==#{dmx1513}")
dmx1514=VerifyEHACritical("DMX-1514==#{dmx1514+500}")

Write("EVR_WARNING_LO statistics verified")

dmx0417=VerifyEHACritical("DMX-0417==#{dmx0417+2842}")
dmx0416=VerifyEHACritical("DMX-0416==#{dmx0416+2844}")
dmx1522=VerifyEHACritical("DMX-1522==#{dmx1522}")
dmx1523=VerifyEHACritical("DMX-1523==#{dmx1523+2844}")

Write("EVR_CMD statistics verified")

dmx0422=VerifyEHACritical("DMX-0422==#{dmx0422+498}")
dmx0421=VerifyEHACritical("DMX-0421==#{dmx0421+500}")
dmx1516=VerifyEHACritical("DMX-1516==#{dmx1516}")
dmx1517=VerifyEHACritical("DMX-1517==#{dmx1517+500}")

Write("EVR_ACT_HI statistics verified")

dmx0432=VerifyEHACritical("DMX-0432==#{dmx0432+498}") 
dmx0431=VerifyEHACritical("DMX-0431==#{dmx0431+500}")
dmx1519=VerifyEHACritical("DMX-1519==#{dmx1519}")
dmx1520=VerifyEHACritical("DMX-1520==#{dmx1520+500}")

Write("EVR_ACT_LO statistics verified")

dmx0437=VerifyEHACritical("DMX-0436==#{dmx0437+4542}")
dmx0436=VerifyEHACritical("DMX-0436==#{dmx0436+4544}")
dmx1525=VerifyEHACritical("DMX-1525==#{dmx1525}")
dmx1526=VerifyEHACritical("DMX-1526==#{dmx1526+4544}")

Write("EVR_DIAG statistics verified")

dmx0447=VerifyEHACritical("DMX-0447==#{dmx0447+508}")
dmx0446=VerifyEHACritical("DMX-0446==#{dmx0446+510}")
Write("EVR_DP statistics verified")

Write("All default settings verified")
SignOff()

Write("Changing the values for EVR_FATAL_RT...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_FATAL_RT,4,RT_RING,400,TRUE,REALTIME")
Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0435==FLOWING")
VerifyEHACritical("DMX-0403==4")
VerifyEHACritical("DMX-0428==2")
VerifyEHACritical("DMX-0408==8")
VerifyEHACritical("DMX-0413==7")
VerifyEHACritical("DMX-0418==5")
VerifyEHACritical("DMX-0423==3")
VerifyEHACritical("DMX-0433==1")
VerifyEHACritical("DMX-0438==6")
VerifyEHACritical("DMX-0448==0")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EVR_FATAL_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_FATAL_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_FATAL_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==3","service_priority==4", "layout==DWN_RT_RING_TYPE",
	"limit==400","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end

Write("Changing the values for EVR_WARNING_HI_RT...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_WARN_HI_RT,4,RT_RING,400,TRUE,REALTIME")
Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0435==FLOWING")
VerifyEHACritical("DMX-0403==5")
VerifyEHACritical("DMX-0428==2")
VerifyEHACritical("DMX-0408==4")
VerifyEHACritical("DMX-0413==8")
VerifyEHACritical("DMX-0418==6")
VerifyEHACritical("DMX-0423==3")
VerifyEHACritical("DMX-0433==1")
VerifyEHACritical("DMX-0438==7")
VerifyEHACritical("DMX-0448==0")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EVR_WARN_HI_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_WARN_HI_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_WARN_HI_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==3","service_priority==4", "layout==DWN_RT_RING_TYPE",
	"limit==400","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end

Write("Changing the values for EVR_WARN_LO_RT...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_WARN_LO_RT,0,RT_RING,400,TRUE,REALTIME")
Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0435==FLOWING")
VerifyEHACritical("DMX-0403==6")
VerifyEHACritical("DMX-0428==3")
VerifyEHACritical("DMX-0408==5")
VerifyEHACritical("DMX-0413==0")
VerifyEHACritical("DMX-0418==7")
VerifyEHACritical("DMX-0423==4")
VerifyEHACritical("DMX-0433==2")
VerifyEHACritical("DMX-0438==8")
VerifyEHACritical("DMX-0448==1")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EVR_WARN_LO_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_WARN_LO_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_WARN_LO_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==3","service_priority==0", "layout==DWN_RT_RING_TYPE",
	"limit==400","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end
 
Write("Changing the values for EVR_CMD_RT...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_CMD_RT,1,RT_RING,400,TRUE,REALTIME")
Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0435==FLOWING")
VerifyEHACritical("DMX-0403==7")
VerifyEHACritical("DMX-0428==4")
VerifyEHACritical("DMX-0408==6")
VerifyEHACritical("DMX-0413==0")
VerifyEHACritical("DMX-0418==1")
VerifyEHACritical("DMX-0423==5")
VerifyEHACritical("DMX-0433==3")
VerifyEHACritical("DMX-0438==8")
VerifyEHACritical("DMX-0448==2")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EVR_CMD_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_CMD_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_CMD_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==3","service_priority==1", "layout==DWN_RT_RING_TYPE",
	"limit==400","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end
 
Write("Changing the values for EVR_ACT_HI_RT...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_ACT_HI_RT,6,RT_RING,400,TRUE,REALTIME")
Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0435==FLOWING")
VerifyEHACritical("DMX-0403==7")
VerifyEHACritical("DMX-0428==4")
VerifyEHACritical("DMX-0408==5")
VerifyEHACritical("DMX-0413==0")
VerifyEHACritical("DMX-0418==1")
VerifyEHACritical("DMX-0423==6")
VerifyEHACritical("DMX-0433==3")
VerifyEHACritical("DMX-0438==8")
VerifyEHACritical("DMX-0448==2")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EVR_ACT_HI_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_ACT_HI_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_ACT_HI_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==3","service_priority==6", "layout==DWN_RT_RING_TYPE",
	"limit==400","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end
 
Write("Changing the values for EHA_TLM_RT...")
Send("DMX_DWN_PKTBUF_PRM_SET,EHA_TLM_RT,6,RT_RING,400,TRUE,REALTIME")
Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0435==FLOWING")
VerifyEHACritical("DMX-0403==6")
VerifyEHACritical("DMX-0428==8")
VerifyEHACritical("DMX-0408==4")
VerifyEHACritical("DMX-0413==0")
VerifyEHACritical("DMX-0418==1")
VerifyEHACritical("DMX-0423==5")
VerifyEHACritical("DMX-0433==3")
VerifyEHACritical("DMX-0438==7")
VerifyEHACritical("DMX-0448==2")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EHA_TLM_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EHA_TLM_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EHA_TLM_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==3","service_priority==8", "layout==DWN_RT_RING_TYPE",
	"limit==400","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end
 
Write("Changing the values for EVR_ACT_LO_RT...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_ACT_LO_RT,2,RT_RING,400,TRUE,REALTIME")
Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0435==FLOWING")
VerifyEHACritical("DMX-0403==6")
VerifyEHACritical("DMX-0428==8")
VerifyEHACritical("DMX-0408==4")
VerifyEHACritical("DMX-0413==0")
VerifyEHACritical("DMX-0418==1")
VerifyEHACritical("DMX-0423==5")
VerifyEHACritical("DMX-0433==2")
VerifyEHACritical("DMX-0438==7")
VerifyEHACritical("DMX-0448==3")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EVR_ACT_LO_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_ACT_LO_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_ACT_LO_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==3","service_priority==2", "layout==DWN_RT_RING_TYPE",
	"limit==400","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end
 
Write("Changing the values for EVR_DIAG_RT...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_DIAG_RT,3,RT_RING,400,TRUE,REALTIME")
Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0435==FLOWING")
VerifyEHACritical("DMX-0403==7")
VerifyEHACritical("DMX-0428==8")
VerifyEHACritical("DMX-0408==5")
VerifyEHACritical("DMX-0413==0")
VerifyEHACritical("DMX-0418==1")
VerifyEHACritical("DMX-0423==6")
VerifyEHACritical("DMX-0433==2")
VerifyEHACritical("DMX-0438==3")
VerifyEHACritical("DMX-0448==4")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of EVR_DIAG_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_DIAG_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_DIAG_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==3","service_priority==3", "layout==DWN_RT_RING_TYPE",
	"limit==400","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 
 
Write("Changing the values for RECORDED_DP...")
Send("DMX_DWN_PKTBUF_PRM_SET,RECORDED_DP,7,RT_RING,400,TRUE,RECORDED")
Write("Verifying telemetry channels...")
VerifyEHACritical("DMX-0435==FLOWING")
VerifyEHACritical("DMX-0403==6")
VerifyEHACritical("DMX-0428==8")
VerifyEHACritical("DMX-0408==4")
VerifyEHACritical("DMX-0413==0")
VerifyEHACritical("DMX-0418==1")
VerifyEHACritical("DMX-0423==5")
VerifyEHACritical("DMX-0433==2")
VerifyEHACritical("DMX-0438==3")
VerifyEHACritical("DMX-0448==7")
Write("Telemetry channels verified")
SignOff

Send("Dumping the values of RECORDED_DP...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,RECORDED_DP")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_RECORDED_DP","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==3","service_priority==7", "layout==DWN_RT_RING_TYPE",
	"limit==400","enabled==True","type==DWN_PB_RECORDED")
  Write("Data Product parameters verified")
  SignOff()
 end 
 
 Write("Increasing uplink speed...")
Send("udld rcea select_uplink_speed 256000")
Write("Verifying uplink speed...")
if VerifyEHA("SSE1-0501==256000")
  Write("Uplink speed at 256 Kbps")
end
SignOff()

Write("Closing all packet buffer gates...")
Send("DMX_DWN_SET_PKTBUF_GATES,ALL,OPENED,CLOSED")
SignOff()

Send("/proj/msl/testbed/procedures/DwnCmd/procedure2/500plus.txt")
sleep 1.minute

Write("Opening all packet buffer gates...")
Send("DMX_DWN_SET_PKTBUF_GATES,ALL,OPENED,OPENED")
current_clk=$curr_sclk
VerifyEVRCount("WARNING_LO==400",current_clk)
VerifyEVRCount("COMMAND==400",current_clk)
VerifyEVRCount("ACTIVITY_LO==400",current_clk)
VerifyEVRCount("DIAGNOSTIC==400",current_clk)
VerifyEVRCount("WARNING_HI==400",current_clk)
VerifyEVRCount("ACTIVITY_HI==400",current_clk)

Write("Verifying telemetry channels...")
 
dmx0427=VerifyEHACritical("DMX-0427==#{dmx0427}")
dmx0426=VerifyEHACritical("DMX-0426")
Write("RT_EHA statistics verified")

dmx0407=VerifyEHACritical("DMX-0407==#{dmx0407+100}")
dmx0406=VerifyEHACritical("DMX-0406==#{dmx0406+500}")
dmx1510=VerifyEHACritical("DMX-1510==#{dmx1510}")
dmx1511=VerifyEHACritical("DMX-1511==#{dmx1511+500}")

Write("EVR_WRN_HI statistics verified")

dmx0412=VerifyEHACritical("DMX-0412==#{dmx0412+100}")
dmx0411=VerifyEHACritical("DMX-0411==#{dmx0411+500}")
dmx1513=VerifyEHACritical("DMX-1513==#{dmx1513}")
dmx1514=VerifyEHACritical("DMX-1514==#{dmx1514+500}")

Write("EVR_WARNING_LO statistics verified")

dmx0417=VerifyEHACritical("DMX-0417==#{dmx0417+2444}")
dmx0416=VerifyEHACritical("DMX-0416==#{dmx0416+2844}")
dmx1522=VerifyEHACritical("DMX-1522==#{dmx1522}")
dmx1523=VerifyEHACritical("DMX-1523==#{dmx1523+2844}")

Write("EVR_CMD statistics verified")

dmx0422=VerifyEHACritical("DMX-0422==#{dmx0422+100}")
dmx0421=VerifyEHACritical("DMX-0421==#{dmx0421+500}")
dmx1516=VerifyEHACritical("DMX-1516==#{dmx1516}")
dmx1517=VerifyEHACritical("DMX-1517==#{dmx1517+500}")

Write("EVR_ACT_HI statistics verified")

dmx0432=VerifyEHACritical("DMX-0432==#{dmx0432+100}") 
dmx0431=VerifyEHACritical("DMX-0431==#{dmx0431+500}")
dmx1519=VerifyEHACritical("DMX-1519==#{dmx1519}")
dmx1520=VerifyEHACritical("DMX-1520==#{dmx1520+500}")

Write("EVR_ACT_LO statistics verified")

dmx0437=VerifyEHACritical("DMX-0436==#{dmx0437+4144}")
dmx0436=VerifyEHACritical("DMX-0436==#{dmx0436+4544}")
dmx1525=VerifyEHACritical("DMX-1525==#{dmx1525}")
dmx1526=VerifyEHACritical("DMX-1526==#{dmx1526+4544}")

Write("EVR_DIAG statistics verified")

dmx0447=VerifyEHACritical("DMX-0447==#{dmx0447+110}")
dmx0446=VerifyEHACritical("DMX-0446==#{dmx0446+510}")
Write("EVR_DP statistics verified")

Write("All default settings verified")
SignOff()
Write("Test Activity 1-B: Passed")
SignOff()

#TEST CASE C

Write("Disabling EVR_FATAL_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_FATAL_RT,0,RT_RING,75,FALSE,REALTIME")

Write("Verifying telemetry channels...")
dmx0400=VerifyEHACritical("DMX-0400==BLOCKED") 
dmx0403=VerifyEHACritical("DMX-0403==0") 
SignOff()

Write("Dumping the values of the EVR_FATAL_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_FATAL_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_FATAL_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==4","service_priority==0", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==False","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 
 
 Write("Enabling the EVR_FATAL_RT packet buffer...")
 Send("DMX_DWN_PKTBUF_PRM_SET,EVR_FATAL_RT,0,RT_RING,75,TRUE,REALTIME")
 dmx0400=VerifyEHACritical("DMX-0400==FLOWING")
 
Write("Dumping the values of the EVR_FATAL_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_FATAL_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_FATAL_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==5","service_priority==0", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 
 
Write("Disabling the EVR_ACT_LO_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_ACT_LO_RT,6,RT_RING,200,FALSE,REALTIME")
Write("Verifying telemetry...")
dmx0430=VerifyEHACritical("DMX-0430==BLOCKED")
dmx0432=VerifyEHACritical("DMX-0432==#{dmx0432+2}")
dmx0433=VerifyEHACritical("DMX-0433==6")
dmx0431=VerifyEHACritical("DMX-0431==#{dmx0431}")
dmx1519=VerifyEHACritical("DMX-1519==#{dmx1519}")
dmx1520=VerifyEHACritical("DMX-1520==#{dmx1520+2}")
Write("Dumping the values of EVR_ACT_LO_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_ACT_LO_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_ACT_LO_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==4","service_priority==6", "layout==DWN_RT_RING_TYPE",
	"limit==200","enabled==False","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 

Write("Generating Activity Lo EVR")
Send("SFP_MONITOR_RESET,MON_SWITCH_MISCOMPARE_RUMU_A_SW_A")
Write("Verifying telemetry...")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH")
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS")
dmx0432=VerifyEHACritical("DMX-0432==#{dmx0432+1}")
dmx0431=VerifyEHACritical("DMX-0431==#{dmx0431}")
dmx1519=VerifyEHACritical("DMX-1519==#{dmx1519}")
dmx1520=VerifyEHACritical("DMX-1520==#{dmx1520+1}")
Write("Telemetry verified.")
SignOff()

Write("Enabling the EVR_ACT_LO_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_ACT_LO_RT,6,RT_RING,200,TRUE,REALTIME")
Write("Verifying telemetry...")
dmx0430=VerifyEHACritical("DMX-0430==FLOWING")
dmx0432=VerifyEHACritical("DMX-0432==#{dmx0432}")
dmx0431=VerifyEHACritical("DMX-0431==#{dmx0431+2}")
dmx1519=VerifyEHACritical("DMX-1519==#{dmx1519}")
dmx1520=VerifyEHACritical("DMX-1520==#{dmx1520+2}")
Write("Dumping the values of EVR_ACT_LO_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_ACT_LO_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_ACT_LO_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==5","service_priority==6", "layout==DWN_RT_RING_TYPE",
	"limit==200","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 

Write("Generating Activity Lo EVR")
Send("SFP_MONITOR_RESET,MON_SWITCH_MISCOMPARE_RUMU_A_SW_A")
Write("Verifying telemetry...")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED")
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY")
VerifyEVRCritical("FBM_EVR_MONITOR_RESET")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH")
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS")
dmx0432=VerifyEHACritical("DMX-0432==#{dmx0432+0}")
dmx0431=VerifyEHACritical("DMX-0431==#{dmx0431+1}")
dmx1519=VerifyEHACritical("DMX-1519==#{dmx1519}")
dmx1520=VerifyEHACritical("DMX-1520==#{dmx1520+1}")
Write("Telemetry verified.")
SignOff()

Write("Disabling the EVR_ACT_HI_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_ACT_HI_RT,4,RT_RING,75,FALSE,REALTIME")
Write("Verifying telemetry...")
dmx0420=VerifyEHACritical("DMX-0420==BLOCKED")
dmx0423=VerifyEHACritical("DMX-0423==3")
Write("Dumping the values of EVR_ACT_HI_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_ACT_HI_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_ACT_HI_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==4","service_priority==4", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==False","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 
 
Write("Generating Activity Hi EVR")
Send("HDW_UPL_SELECT_NORMAL")
Write("Verifying telemetry...")
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY")
VerifyEVRCritical("NONE")
VerifyEVRCritical("CMD_EVR_VC0_COMMAND_DISPATCH")
dmx0422=VerifyEHACritical("DMX-0422==#{dmx0422+1}")
dmx0421=VerifyEHACritical("DMX-0421==#{dmx0421}")
dmx1516=VerifyEHACritical("DMX-1516==#{dmx1516}")
dmx1517=VerifyEHACritical("DMX-1517==#{dmx1517+1}")
Write("Telemetry verified.")
SignOff()

Write("Enabling the EVR_ACT_HI_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_ACT_HI_RT,4,RT_RING,75,TRUE,REALTIME")
Write("Verifying telemetry...")
dmx0420=VerifyEHACritical("DMX-0420==FLOWING")
Write("Dumping the values of EVR_ACT_HI_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_ACT_HI_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_ACT_HI_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==5","service_priority==4", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 
 
Write("Generating Activity Hi EVR")
Send("HDW_UPL_SELECT_NORMAL")
Write("Verifying telemetry...")
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY")
VerifyEVRCritical("CRCMGR_EVR_GROUND_CMD_EXECUTED")
VerifyEVRCritical("CMD_EVR_VC0_COMMAND_DISPATCH")
dmx0422=VerifyEHACritical("DMX-0422==#{dmx0422}")
dmx0421=VerifyEHACritical("DMX-0421==#{dmx0421+1}")
dmx1516=VerifyEHACritical("DMX-1516==#{dmx1516}")
dmx1517=VerifyEHACritical("DMX-1517==#{dmx1517+1}")
Write("Telemetry verified.")
SignOff()
 
Write("Disabling the EVR_WARN_LO_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_WARN_LO_RT,2,RT_RING,75,FALSE,REALTIME")
Write("Verifying telemetry...")
dmx0410=VerifyEHACritical("DMX-0410==BLOCKED")
dmx0413=VerifyEHACritical("DMX-0413==2")
Write("Dumping the values of EVR_WARN_LO_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_WARN_LO_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_WARN_LO_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==4","service_priority==2", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==False","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 
=begin
#FAULT INJECTION 5-179 PAGE53
=end
Write("Please use the command builder fault injection tool to do step 5-179. Press enter to continue...")
Pause()
Write("Verifying telemetry...")
VerifyEVRCritical("UPL_EVR_PRODUCT_STATUS_NOT_COMPLETE_FRAME")
VerifyEVRCritical("UPL_EVR_PROD_UNCORRERR_IN_CODEBLK")
VerifyEVRCritical("UPL_EVR_PRODUCT_REJECTED")
dmx0412=VerifyEHACritical("DMX-0412==#{dmx0412}")
dmx0411=VerifyEHACritical("DMX-0411==#{dmx0411+2}")
dmx1513=VerifyEHACritical("DMX-1513==#{dmx1513}")
dmx1514=VerifyEHACritical("DMX-1514==#{dmx1514+2}")
Write("Telemetry verified.")
SignOff()

Write("Disabling the EVR_WARNING_HI_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_WARN_HI_RT,1,RT_RING,75,FALSE,REALTIME")
Write("Verifying telemetry...")
dmx0405=VerifyEHACritical("DMX-0405==BLOCKED")
dmx0408=VerifyEHACritical("DMX-0408==1")
Write("Dumping the values of EVR_ACT_LO_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_WARN_HI_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_WARN_HI_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==4","service_priority==1", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==False","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 

Write("Generating Warning Hi EVR")
Send("PWR_UTIL_TEST,SWITCH,533,534,0,1")
Write("Verifying telemetry...")
VerifyEVRCount("Warning_HI==0")#pg54
VerifyEVRCritical("PWR_EVR_UNEXPECTED_SWITCH_ON")
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH")
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS")
dmx0407=VerifyEHACritical("DMX-0407==#{dmx0407+1}")
dmx0406=VerifyEHACritical("DMX-0406==#{dmx0406}")
dmx1510=VerifyEHACritical("DMX-1510==#{dmx1510}")
dmx1511=VerifyEHACritical("DMX-1511==#{dmx1511+1}")
Write("Telemetry verified.")
SignOff()

Write("Enabling the EVR_WARN_HI_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_WARN_HI_RT,1,RT_RING,75,TRUE,REALTIME")
Write("Verifying telemetry...")
dmx0405=VerifyEHACritical("DMX-0405==FLOWING")
Write("Dumping the values of EVR_WARN_HI_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_WARN_HI_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_WARN_HI_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==5","service_priority==1", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 
 
Write("Resetting switch monitor...")
 Send("SFP_MONITOR_RESET,MON_SWITCH_MISCOMPARE_RUMU_A_SW_A")

Write("Generating Warning Hi EVR")
Send("PWR_UTIL_TEST,SWITCH,533,534,0,1")
Write("Verifying telemetry...")
VerifyEVRCritical("FBM_EVR_MONITOR_ANNOUNCE")
VerifyEVRCritical("PWR_EVR_UNEXPECTED_SWITCH_ON")
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH")
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS")
dmx0407=VerifyEHACritical("DMX-0407==#{dmx0407+0}")
dmx0406=VerifyEHACritical("DMX-0406==#{dmx0406+1}")
dmx1510=VerifyEHACritical("DMX-1510==#{dmx1510}")
dmx1511=VerifyEHACritical("DMX-1511==#{dmx1511+1}")
Write("Telemetry verified.")
SignOff()

Write("Disabling the EVR_CMD_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_CMD_RT,3,RT_RING,75,FALSE,REALTIME")
Write("Verifying telemetry...")
dmx0415=VerifyEHACritical("DMX-0415==BLOCKED")
dmx0417=VerifyEHACritical("DMX-0417==#{dmx0417+2}")
dmx0418=VerifyEHACritical("DMX-0418==3")
dmx0416=VerifyEHACritical("DMX-0416==#{dmx0416}")
dmx1522=VerifyEHACritical("DMX-1522==#{dmx1522}")
dmx1523=VerifyEHACritical("DMX-1523==#{dmx1523+2}")
Write("Dumping the values of EVR_CMD_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_CMD_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_WARN_HI_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==4","service_priority==3", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==False","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 

Write("Generating Command EVRs...")
Send("CMD_NO_OP")
Write("Verifying telemetry...")
VerifyEVRCount("COMMAND==0")#pg56
VerifyEVRCritical("CMD_EVR_IMM_NO_OP")
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED")
dmx0417=VerifyEHACritical("DMX-0417==#{dmx0417+2}")
dmx0416=VerifyEHACritical("DMX-0416==#{dmx0416}")
dmx1522=VerifyEHACritical("DMX-1522==#{dmx1522}")
dmx1523=VerifyEHACritical("DMX-1523==#{dmx1523+2}")
Write("Telemetry verified.")
SignOff()

Write("Enabling the EVR_WARN_HI_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_CMD_RT,3,RT_RING,75,TRUE,REALTIME")
Write("Verifying telemetry...")
dmx0415=VerifyEHACritical("DMX-0415==FLOWING")
dmx0417=VerifyEHACritical("DMX-0417==#{dmx0417}")
dmx0416=VerifyEHACritical("DMX-0416==#{dmx0416+2}")
dmx1522=VerifyEHACritical("DMX-1522==#{dmx1522}")
dmx1523=VerifyEHACritical("DMX-1523==#{dmx1523+2}")
Write("Dumping the values of EVR_CMD_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_CMD_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_CMD_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==5","service_priority==3", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 
 
Write("Generating Warning Hi EVR")
Send("CMD_NO_OP")
Write("Verifying telemetry...")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH")
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS")
VerifyEVRCritical("CMD_EVR_IMM_NO_OP")
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED")
dmx0417=VerifyEHACritical("DMX-0417==#{dmx0417}")
dmx0416=VerifyEHACritical("DMX-0416==#{dmx0416+1}")
dmx1522=VerifyEHACritical("DMX-1522==#{dmx1522}")
dmx1523=VerifyEHACritical("DMX-1523==#{dmx1523+1}")
Write("Telemetry verified.")
SignOff()

Write("Disabling the EVR_DiAG_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_DIAG_RT,7,RT_RING,200,FALSE,REALTIME")
Write("Verifying telemetry...")
dmx0435=VerifyEHACritical("DMX-0435==BLOCKED")
dmx0437=VerifyEHACritical("DMX-0437==#{dmx0437+2}")
dmx0438=VerifyEHACritical("DMX-0438==7")
dmx0436=VerifyEHACritical("DMX-0436==#{dmx0436}")
dmx1525=VerifyEHACritical("DMX-1525==#{dmx1525}")
dmx1526=VerifyEHACritical("DMX-1526==#{dmx1526+2}")
Write("Dumping the values of EVR_CMD_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_DIAG_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_DIAG_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==4","service_priority==7", "layout==DWN_RT_RING_TYPE",
	"limit==200","enabled==False","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 

Write("Generating Diagnostic EVRs...")
Send("CMD_NO_OP")
Write("Verifying telemetry...")
VerifyEVRCount("DIAGNOSTIC")#pg58
VerifyEVRCritical("CMD_EVR_IMM_NO_OP")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH")
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS")
dmx0437=VerifyEHACritical("DMX-0437==#{dmx0437+2}")
dmx0436=VerifyEHACritical("DMX-0436==#{dmx0436}")
dmx1525=VerifyEHACritical("DMX-1525==#{dmx1525}")
dmx1526=VerifyEHACritical("DMX-1526==#{dmx1526+2}")
Write("Telemetry verified.")
SignOff()

Write("Enabling the EVR_DIAG_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,EVR_DIAG_RT,7,RT_RING,200,TRUE,REALTIME")
Write("Verifying telemetry...")
dmx0435=VerifyEHACritical("DMX-0435==FLOWING")
dmx0437=VerifyEHACritical("DMX-0437==#{dmx0437}")
dmx0436=VerifyEHACritical("DMX-0436==#{dmx0436+2}")
dmx1525=VerifyEHACritical("DMX-1525==#{dmx1525}")
dmx1526=VerifyEHACritical("DMX-1526==#{dmx1526+2}")
Write("Dumping the values of EVR_DIAG_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EVR_CMD_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EVR_DIAG_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==5","service_priority==7", "layout==DWN_RT_RING_TYPE",
	"limit==200","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 
 
Write("Generating Diagnostic EVR")
Send("CMD_NO_OP")
Write("Verifying telemetry...")
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED")
VerifyEVRCritical("CMD_EVR_IMM_NO_OP")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH")
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS")
dmx0437=VerifyEHACritical("DMX-0437==#{dmx0437}")
dmx0436=VerifyEHACritical("DMX-0436==#{dmx0436+2}")
dmx1525=VerifyEHACritical("DMX-1525==#{dmx1525}")
dmx1526=VerifyEHACritical("DMX-1526==#{dmx1526+2}")
Write("Telemetry verified.")
SignOff()

Write("Disabling the EVR_TLM_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,EHA_TLM_RT,5,RT_RING,75,FALSE,REALTIME")
Write("Verifying telemetry...")
dmx0425=VerifyEHACritical("DMX-0425==FLOWING")
dmx0427=VerifyEHACritical("DMX-0427==#{dmx0427}")
dmx0428=VerifyEHACritical("DMX-0428")
dmx0426=VerifyEHACritical("DMX-0426==#{dmx0426}")
Write("Dumping the values of EVR_CMD_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EHA_TLM_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EHA_TLM_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==4","service_priority==5", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==False","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 

Write("Generating EHA...")
Send("CMD_NO_OP")
Write("Verifying telemetry...")
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED")
VerifyEVRCritical("CMD_EVR_IMM_NO_OP")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH")
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS")
dmx0427=VerifyEHACritical("DMX-0427==#{dmx0427}")
dmx0426=VerifyEHACritical("DMX-0426==#{dmx0426}")
Write("Telemetry verified.")
SignOff()

Write("Enabling the EHA_TLM_RT packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,EHA_TLM_RT,5,RT_RING,75,TRUE,REALTIME")
Write("Verifying telemetry...")
dmx0425=VerifyEHACritical("DMX-0425==FLOWING")
dmx0427=VerifyEHACritical("DMX-0427>#{dmx0427}")
dmx0428=VerifyEHACritical("DMX-0428==5")
dmx0426=VerifyEHACritical("DMX-0426>#{dmx0426}")
Write("Dumping the values of EVR_DIAG_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,EHA_TLM_RT")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")

if VerifyDP("193","packet_buffer==DWN_PB_EHA_TLM_RT","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==5","service_priority==5", "layout==DWN_RT_RING_TYPE",
	"limit==75","enabled==True","type==DWN_PB_REALTIME")
  Write("Data Product parameters verified")
  SignOff()
 end 
 
Write("Generating EHA")
Send("CMD_NO_OP")
Write("Verifying telemetry...")
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED")
VerifyEVRCritical("CMD_EVR_IMM_NO_OP")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH")
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS")
dmx0427=VerifyEHACritical("DMX-0427==#{dmx0427}")
dmx0426=VerifyEHACritical("DMX-0426>#{dmx0426+2}")
Write("Telemetry verified.")
SignOff()

Write("Disabling the RECORDED_DP packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,RECORDED_DP,8,DP_FIFO,0,FALSE,RECORDED")
Write("Verifying telemetry...")
dmx0445=VerifyEHACritical("DMX-0445==BLOCKED")
dmx0448=VerifyEHACritical("DMX-0448==8")
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED")
VerifyEVRCritical("PIE_EVR_DMP_PREPARATION_NO_CONSOLE")
VerifyEVRCritical("PDP_EVR_XMIT_DP")
VerifyEVRCritical("PDP_EVR_XMIT_COMPLETE")
VerifyEVRCritical("PDP_EVR_PKT_COMPLETE")
VerifyEVRCritical("PDP_EVR_XMIT_DPOS")
VerifyEVRCritical("PDP_EVR_XMIT_COMPLETE")
VerifyEVRCritical("PDP_EVR_PKT_COMPLETE")
VerifyEVRCritical("PDP_EVR_XMIT_END")
VerifyEVRCritical("PDP_EVR_XMIT_COMPLETE")
VerifyEVRCritical("PDP_EVR_PKT_COMPLETE")
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH")
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS")
dmx0447=VerifyEHACritical("DMX-0447==#{dmx0447+3}")
dmx0446=VerifyEHACritical("DMX-0446==#{dmx0446}")

=begin
if !VerifyDP()
#do nothing 
else
  Write("Data product found. exiting test...")
end
=end

Write("Enabling the RECORDED_DP packet buffer...")
Send("DMX_DWN_PKTBUF_PRM_SET,RECORDED_DP,8,DP_FIFO,0,TRUE,RECORDED")
Write("Verifying telemetry...")
dmx0425=VerifyEHACritical("DMX-0425==FLOWING")
Write("Dumping the values of EVR_DIAG_RT...")
Send("DMX_DWN_PKTBUF_PRM_DMP,17,RECORDED_DP")
DpFile=VerifyDP("193","Filename")
Print("Data Product File Name:#{DpFile}")
current_clk=$curr_sclk
if VerifyDP("193","packet_buffer==DWN_PB_RECORDED_DP","boot_counter==2",
	"Group_Set_Count_Value_pktbuf==7","service_priority==8", "layout==DWN_DP_FIFO_TYPE",
	"limit==0","enabled==True","type==DWN_PB_RECORDED")
  Write("Data Product parameters verified")
 end
VerifyEVRCritical("UPL_EVR_CTRL_CLIENT_DATA_DELIVERY",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCHED",current_clk)
VerifyEVRCritical("PIE_EVR_GROUP_DMP_PREPARATION_NO_CONSOLE",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_DP",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_COMPLETE",current_clk)
VerifyEVRCritical("PDP_EVR_PKT_COMPLETE",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_DPOS",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_COMPLETE",current_clk)
VerifyEVRCritical("PDP_EVR_PKT_COMPLETE",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_END",current_clk)
VerifyEVRCritical("PDP_EVR_XMIT_COMPLETE",current_clk)
VerifyEVRCritical("PDP_EVR_PKT_COMPLETE",current_clk)
VerifyEVRCritical("CMD_EVR_VC1_CMD_DISPATCH",current_clk)
VerifyEVRCritical("CMD_EVR_CMD_COMPLETED_SUCCESS",current_clk)
dmx0447=VerifyEHACritical("DMX-0447==#{dmx0447}")
dmx0446=VerifyEHACritical("DMX-0446==#{dmx0446+3}")
 SignOff()

 
 Write("Test Activity 1-C: Passed")
 Stop()
#TEST CASE D