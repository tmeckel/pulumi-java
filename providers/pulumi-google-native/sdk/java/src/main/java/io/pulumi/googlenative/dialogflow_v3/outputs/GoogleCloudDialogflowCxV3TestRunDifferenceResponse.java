// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3TestRunDifferenceResponse {
    /**
     * A description of the diff, showing the actual output vs expected output.
     * 
     */
    private final String description;
    /**
     * The type of diff.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"description","type"})
    private GoogleCloudDialogflowCxV3TestRunDifferenceResponse(
        String description,
        String type) {
        this.description = Objects.requireNonNull(description);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * A description of the diff, showing the actual output vs expected output.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The type of diff.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3TestRunDifferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3TestRunDifferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.type = defaults.type;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GoogleCloudDialogflowCxV3TestRunDifferenceResponse build() {
            return new GoogleCloudDialogflowCxV3TestRunDifferenceResponse(description, type);
        }
    }
}
