// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The description of differences between original and replayed agent output.
 * 
 */
public final class GoogleCloudDialogflowCxV3TestRunDifferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3TestRunDifferenceResponse Empty = new GoogleCloudDialogflowCxV3TestRunDifferenceResponse();

    /**
     * A description of the diff, showing the actual output vs expected output.
     * 
     */
    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The type of diff.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public GoogleCloudDialogflowCxV3TestRunDifferenceResponse(
        String description,
        String type) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudDialogflowCxV3TestRunDifferenceResponse() {
        this.description = null;
        this.type = null;
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
