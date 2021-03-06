/*
 * Copyright 2002-2014 iGeek, Inc.
 * All Rights Reserved
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package com.igeekinc.util.discburning;

import java.util.Hashtable;

public class BurnDeviceStatusChanged extends BurnDeviceEvent 
{
    private static final long serialVersionUID = -8161703543038654279L;
    Hashtable<String, Object> changeInfo;
    public BurnDeviceStatusChanged(Object source, BurnDevice changedDevice, Hashtable<String, Object> changeInfo)
    {
        super(source, changedDevice);
        this.changeInfo = changeInfo;
    }
    public Hashtable<String, Object> getChangeInfo()
    {
        return changeInfo;
    }
}
