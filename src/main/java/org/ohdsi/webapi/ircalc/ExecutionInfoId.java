/*
 * Copyright 2016 Observational Health Data Sciences and Informatics [OHDSI.org].
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
package org.ohdsi.webapi.ircalc;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 *
 * @author Chris Knoll <cknoll@ohdsi.org>
 */
@Embeddable
public class ExecutionInfoId  implements Serializable {
  private static final long serialVersionUID = 1L;
  
  public ExecutionInfoId() {
  }
  
  public ExecutionInfoId(Integer analysisId, Integer sourceId) {
    this.analysisId = analysisId;
    this.sourceId = sourceId;
  }
  
  @Column(name = "analysis_id", insertable = false, updatable = false)
  private Integer analysisId;

  @Column(name = "source_id")
  private Integer sourceId;  

  public Integer getAnalysisId() {
    return analysisId;
  }

  public void setAnalysisId(Integer analysisId) {
    this.analysisId = analysisId;
  }

  public Integer getSourceId() {
    return sourceId;
  }

  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }
  
  public boolean equals(Object o) {
    return ((o instanceof ExecutionInfoId eii) 
            && analysisId.equals(eii.getAnalysisId()) 
            && sourceId.equals(eii.getSourceId()) );
  }
  
  public int hashCode() {
    return analysisId + sourceId;
  }  
}

