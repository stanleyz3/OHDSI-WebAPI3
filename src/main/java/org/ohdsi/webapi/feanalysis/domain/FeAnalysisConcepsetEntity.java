package org.ohdsi.webapi.feanalysis.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.ohdsi.webapi.common.CommonConceptSetEntity;

@Entity
@Table(name = "fe_analysis_conceptset")
public class FeAnalysisConcepsetEntity extends CommonConceptSetEntity {
  @Id
  @GenericGenerator(
      name = "fe_conceptset_generator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
          @Parameter(name = "sequence_name", value = "fe_conceptset_sequence"),
          @Parameter(name = "increment_size", value = "1")
      }
  )
  @GeneratedValue(generator = "fe_conceptset_generator")
  private Long id;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fe_analysis_id")
  private FeAnalysisWithCriteriaEntity featureAnalysis;

  public FeAnalysisConcepsetEntity() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FeAnalysisWithCriteriaEntity getFeatureAnalysis() {
    return featureAnalysis;
  }

  public void setFeatureAnalysis(FeAnalysisWithCriteriaEntity featureAnalysis) {
    this.featureAnalysis = featureAnalysis;
  }
}
