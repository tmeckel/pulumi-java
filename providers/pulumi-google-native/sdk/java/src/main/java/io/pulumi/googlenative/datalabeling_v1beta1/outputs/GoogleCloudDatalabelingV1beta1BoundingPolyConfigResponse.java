// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse {
    /**
     * Annotation spec set resource name.
     * 
     */
    private final String annotationSpecSet;
    /**
     * Optional. Instruction message showed on contributors UI.
     * 
     */
    private final String instructionMessage;

    @OutputCustomType.Constructor({"annotationSpecSet","instructionMessage"})
    private GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse(
        String annotationSpecSet,
        String instructionMessage) {
        this.annotationSpecSet = Objects.requireNonNull(annotationSpecSet);
        this.instructionMessage = Objects.requireNonNull(instructionMessage);
    }

    /**
     * Annotation spec set resource name.
     * 
     */
    public String getAnnotationSpecSet() {
        return this.annotationSpecSet;
    }
    /**
     * Optional. Instruction message showed on contributors UI.
     * 
     */
    public String getInstructionMessage() {
        return this.instructionMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String annotationSpecSet;
        private String instructionMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationSpecSet = defaults.annotationSpecSet;
    	      this.instructionMessage = defaults.instructionMessage;
        }

        public Builder setAnnotationSpecSet(String annotationSpecSet) {
            this.annotationSpecSet = Objects.requireNonNull(annotationSpecSet);
            return this;
        }

        public Builder setInstructionMessage(String instructionMessage) {
            this.instructionMessage = Objects.requireNonNull(instructionMessage);
            return this;
        }

        public GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse build() {
            return new GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse(annotationSpecSet, instructionMessage);
        }
    }
}
