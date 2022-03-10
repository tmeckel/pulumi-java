// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PrivateLinkServiceConnectionStatePropertyResponse {
    /**
     * The actions required for private link service connection.
     * 
     */
    private final String actionsRequired;
    /**
     * The private link service connection description.
     * 
     */
    private final String description;
    /**
     * The private link service connection status.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor
    private PrivateLinkServiceConnectionStatePropertyResponse(
        @OutputCustomType.Parameter("actionsRequired") String actionsRequired,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("status") String status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = status;
    }

    /**
     * The actions required for private link service connection.
     * 
    */
    public String getActionsRequired() {
        return this.actionsRequired;
    }
    /**
     * The private link service connection description.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The private link service connection status.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStatePropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionsRequired;
        private String description;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStatePropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionsRequired(String actionsRequired) {
            this.actionsRequired = Objects.requireNonNull(actionsRequired);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public PrivateLinkServiceConnectionStatePropertyResponse build() {
            return new PrivateLinkServiceConnectionStatePropertyResponse(actionsRequired, description, status);
        }
    }
}
