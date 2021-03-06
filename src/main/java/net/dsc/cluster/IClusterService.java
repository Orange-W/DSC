package net.dsc.cluster;

import java.util.List;
import java.util.Map;

import com.hazelcast.core.IMap;
import com.hazelcast.core.MultiMap;

import net.floodlightcontroller.core.module.IFloodlightService;

public interface  IClusterService extends IFloodlightService{
	
	//控制器<->交换机映射
	public  void putControllerMappingSwitch(ControllerModel c,String dpid,String role);
	public void removeControllerMappingSwitch(ControllerModel c, String dpid);
	public MultiMap<ControllerModel, SwitchConnectModel> getControllerMappingSwitch();
	//控制器集合
	public void addController(ControllerModel c);
	public void removeController(ControllerModel c);
	public IMap<String, ControllerModel> getControllers();
	
	//master switch dpid<->controllerId映射 
	//Master集合
	public void putMasterMap(String dpid);
    public void removeMasterMap(String dpid);
	public IMap<String, String> getMasterMap();
	//控制器负载集合
	public void ControllerLoadIncrease(String controllerId,int num);
	public void ControllerLoadReduce(String controllerId,int num);
	public void ControllerLoadReset(String controllerId);
	public List<String> getSortedControllerLoad();
	
	//交换机集合
	public void putSwitch(String dpid,String role,String switchIP);
	public void removeSwitch(String dpid);
	public IMap<String, SwitchConnectModel> getSwithcs();
	
}
