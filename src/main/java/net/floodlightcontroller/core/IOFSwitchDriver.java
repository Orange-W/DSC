/**
 *    Copyright 2013, Big Switch Networks, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License"); you may
 *    not use this file except in compliance with the License. You may obtain
 *    a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *    License for the specific language governing permissions and limitations
 *    under the License.
 **/

package net.floodlightcontroller.core;

import net.floodlightcontroller.core.IOFSwitchBackend;
import org.projectfloodlight.openflow.protocol.OFFactory;

import net.floodlightcontroller.core.SwitchDescription;

public interface IOFSwitchDriver {
    /**
     * Return an IOFSwitch object based on switch's manufacturer description
     * from OFDescriptionStatitics.
     * 返回IOFSwitch对象基于交换机制造商的OF统计信息描述
     * @param description DescriptionStatistics from the switch instance 从交换机实例中得到的统计信息
     * @return A IOFSwitch instance if the driver found an implementation 
     * for the given description. Null otherwise
     * 如果根据这个描述找到一个实现则返回否则为NULL
     */
    public IOFSwitchBackend getOFSwitchImpl(SwitchDescription description, OFFactory factory);
}