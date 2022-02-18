// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A Symptom instance.
 * 
 */
public final class SymptomResponse extends io.pulumi.resources.InvokeArgs {

    public static final SymptomResponse Empty = new SymptomResponse();

    /**
     * Timestamp when the Symptom is created.
     * 
     */
    @InputImport(name="createTime", required=true)
    private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * Detailed information of the current Symptom.
     * 
     */
    @InputImport(name="details", required=true)
    private final String details;

    public String getDetails() {
        return this.details;
    }

    /**
     * Type of the Symptom.
     * 
     */
    @InputImport(name="symptomType", required=true)
    private final String symptomType;

    public String getSymptomType() {
        return this.symptomType;
    }

    /**
     * A string used to uniquely distinguish a worker within a TPU node.
     * 
     */
    @InputImport(name="workerId", required=true)
    private final String workerId;

    public String getWorkerId() {
        return this.workerId;
    }

    public SymptomResponse(
        String createTime,
        String details,
        String symptomType,
        String workerId) {
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.details = Objects.requireNonNull(details, "expected parameter 'details' to be non-null");
        this.symptomType = Objects.requireNonNull(symptomType, "expected parameter 'symptomType' to be non-null");
        this.workerId = Objects.requireNonNull(workerId, "expected parameter 'workerId' to be non-null");
    }

    private SymptomResponse() {
        this.createTime = null;
        this.details = null;
        this.symptomType = null;
        this.workerId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SymptomResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String details;
        private String symptomType;
        private String workerId;

        public Builder() {
    	      // Empty
        }

        public Builder(SymptomResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.details = defaults.details;
    	      this.symptomType = defaults.symptomType;
    	      this.workerId = defaults.workerId;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDetails(String details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setSymptomType(String symptomType) {
            this.symptomType = Objects.requireNonNull(symptomType);
            return this;
        }

        public Builder setWorkerId(String workerId) {
            this.workerId = Objects.requireNonNull(workerId);
            return this;
        }

        public SymptomResponse build() {
            return new SymptomResponse(createTime, details, symptomType, workerId);
        }
    }
}
