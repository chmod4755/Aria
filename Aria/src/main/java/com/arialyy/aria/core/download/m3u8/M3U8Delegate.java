/*
 * Copyright (C) 2016 AriaLyy(https://github.com/AriaLyy/Aria)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arialyy.aria.core.download.m3u8;

import com.arialyy.aria.core.common.BaseDelegate;
import com.arialyy.aria.core.inf.AbsTarget;
import com.arialyy.aria.core.inf.AbsTaskWrapper;

/**
 * m3u8 委托
 */
public class M3U8Delegate<TARGET extends AbsTarget> extends BaseDelegate<TARGET> {

  public M3U8Delegate(TARGET target) {
    super(target);
    mTarget.getTaskWrapper().setRequestType(AbsTaskWrapper.M3U8_FILE);
  }

  //public M3U8LiveDelegate asLive(){
  //  return
  //}
}