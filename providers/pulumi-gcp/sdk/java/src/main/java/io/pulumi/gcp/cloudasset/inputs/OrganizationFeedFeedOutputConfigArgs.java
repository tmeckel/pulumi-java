// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudasset.inputs.OrganizationFeedFeedOutputConfigPubsubDestinationArgs;
import java.util.Objects;


public final class OrganizationFeedFeedOutputConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationFeedFeedOutputConfigArgs Empty = new OrganizationFeedFeedOutputConfigArgs();

    /**
     * Destination on Cloud Pubsub.
     * Structure is documented below.
     * 
     */
    @InputImport(name="pubsubDestination", required=true)
      private final Input<OrganizationFeedFeedOutputConfigPubsubDestinationArgs> pubsubDestination;

    public Input<OrganizationFeedFeedOutputConfigPubsubDestinationArgs> getPubsubDestination() {
        return this.pubsubDestination;
    }

    public OrganizationFeedFeedOutputConfigArgs(Input<OrganizationFeedFeedOutputConfigPubsubDestinationArgs> pubsubDestination) {
        this.pubsubDestination = Objects.requireNonNull(pubsubDestination, "expected parameter 'pubsubDestination' to be non-null");
    }

    private OrganizationFeedFeedOutputConfigArgs() {
        this.pubsubDestination = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationFeedFeedOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<OrganizationFeedFeedOutputConfigPubsubDestinationArgs> pubsubDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationFeedFeedOutputConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubDestination = defaults.pubsubDestination;
        }

        public Builder pubsubDestination(Input<OrganizationFeedFeedOutputConfigPubsubDestinationArgs> pubsubDestination) {
            this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
            return this;
        }

        public Builder pubsubDestination(OrganizationFeedFeedOutputConfigPubsubDestinationArgs pubsubDestination) {
            this.pubsubDestination = Input.of(Objects.requireNonNull(pubsubDestination));
            return this;
        }
        public OrganizationFeedFeedOutputConfigArgs build() {
            return new OrganizationFeedFeedOutputConfigArgs(pubsubDestination);
        }
    }
}
