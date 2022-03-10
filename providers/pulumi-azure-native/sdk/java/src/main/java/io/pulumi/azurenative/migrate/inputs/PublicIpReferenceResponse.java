// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines reference to a public IP.
 * 
 */
public final class PublicIpReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final PublicIpReferenceResponse Empty = new PublicIpReferenceResponse();

    /**
     * Gets the ARM resource ID of the tracked resource being referenced.
     * 
     */
    @InputImport(name="sourceArmResourceId", required=true)
      private final String sourceArmResourceId;

    public String getSourceArmResourceId() {
        return this.sourceArmResourceId;
    }

    public PublicIpReferenceResponse(String sourceArmResourceId) {
        this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId, "expected parameter 'sourceArmResourceId' to be non-null");
    }

    private PublicIpReferenceResponse() {
        this.sourceArmResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicIpReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sourceArmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicIpReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceArmResourceId = defaults.sourceArmResourceId;
        }

        public Builder sourceArmResourceId(String sourceArmResourceId) {
            this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId);
            return this;
        }
        public PublicIpReferenceResponse build() {
            return new PublicIpReferenceResponse(sourceArmResourceId);
        }
    }
}
