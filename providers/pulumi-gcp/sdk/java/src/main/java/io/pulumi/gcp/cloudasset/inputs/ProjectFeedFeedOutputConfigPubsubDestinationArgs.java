// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ProjectFeedFeedOutputConfigPubsubDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectFeedFeedOutputConfigPubsubDestinationArgs Empty = new ProjectFeedFeedOutputConfigPubsubDestinationArgs();

    /**
     * Destination on Cloud Pubsub topic.
     * 
     */
    @Import(name="topic", required=true)
      private final Output<String> topic;

    public Output<String> getTopic() {
        return this.topic;
    }

    public ProjectFeedFeedOutputConfigPubsubDestinationArgs(Output<String> topic) {
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private ProjectFeedFeedOutputConfigPubsubDestinationArgs() {
        this.topic = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectFeedFeedOutputConfigPubsubDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectFeedFeedOutputConfigPubsubDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topic = defaults.topic;
        }

        public Builder topic(Output<String> topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Output.of(Objects.requireNonNull(topic));
            return this;
        }        public ProjectFeedFeedOutputConfigPubsubDestinationArgs build() {
            return new ProjectFeedFeedOutputConfigPubsubDestinationArgs(topic);
        }
    }
}
