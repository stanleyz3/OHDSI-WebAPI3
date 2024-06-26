/*
 * Copyright 2015 fdefalco.
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
package org.ohdsi.webapi.service;

import java.util.ArrayList;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.ohdsi.webapi.activity.Tracker;
import org.springframework.stereotype.Component;

 /**
  * Example REST service - will be depreciated
  * in a future release
  * 
  * @deprecated
  * @summary Activity
  */
@Path("/activity/")
@Component
public class ActivityService {
 /**
  * Example REST service - will be depreciated
  * in a future release
  * 
  * @deprecated
  * @summary DO NOT USE
  */
  @Path("latest")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Object[] getLatestActivity() {
    return Tracker.getActivity();
  }
}
