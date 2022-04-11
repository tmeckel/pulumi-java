// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.eventgrid.enums.InputSchema;
import io.pulumi.azurenative.eventgrid.enums.PublicNetworkAccess;
import io.pulumi.azurenative.eventgrid.inputs.InboundIpRuleArgs;
import io.pulumi.azurenative.eventgrid.inputs.JsonInputSchemaMappingArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicArgs Empty = new TopicArgs();

    /**
     * This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     * 
     */
    @Import(name="inboundIpRules")
      private final @Nullable Output<List<InboundIpRuleArgs>> inboundIpRules;

    public Output<List<InboundIpRuleArgs>> getInboundIpRules() {
        return this.inboundIpRules == null ? Codegen.empty() : this.inboundIpRules;
    }

    /**
     * This determines the format that Event Grid should expect for incoming events published to the topic.
     * 
     */
    @Import(name="inputSchema")
      private final @Nullable Output<Either<String,InputSchema>> inputSchema;

    public Output<Either<String,InputSchema>> getInputSchema() {
        return this.inputSchema == null ? Codegen.empty() : this.inputSchema;
    }

    /**
     * This enables publishing using custom event schemas. An InputSchemaMapping can be specified to map various properties of a source schema to various required properties of the EventGridEvent schema.
     * 
     */
    @Import(name="inputSchemaMapping")
      private final @Nullable Output<JsonInputSchemaMappingArgs> inputSchemaMapping;

    public Output<JsonInputSchemaMappingArgs> getInputSchemaMapping() {
        return this.inputSchemaMapping == null ? Codegen.empty() : this.inputSchemaMapping;
    }

    /**
     * Location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring <seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules" />
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Output<Either<String,PublicNetworkAccess>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Codegen.empty() : this.publicNetworkAccess;
    }

    /**
     * The name of the resource group within the user's subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Name of the topic.
     * 
     */
    @Import(name="topicName")
      private final @Nullable Output<String> topicName;

    public Output<String> getTopicName() {
        return this.topicName == null ? Codegen.empty() : this.topicName;
    }

    public TopicArgs(
        @Nullable Output<List<InboundIpRuleArgs>> inboundIpRules,
        @Nullable Output<Either<String,InputSchema>> inputSchema,
        @Nullable Output<JsonInputSchemaMappingArgs> inputSchemaMapping,
        @Nullable Output<String> location,
        @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> topicName) {
        this.inboundIpRules = inboundIpRules;
        this.inputSchema = inputSchema == null ? Output.ofLeft("EventGridSchema") : inputSchema;
        this.inputSchemaMapping = inputSchemaMapping;
        this.location = location;
        this.publicNetworkAccess = publicNetworkAccess == null ? Output.ofLeft("Enabled") : publicNetworkAccess;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.topicName = topicName;
    }

    private TopicArgs() {
        this.inboundIpRules = Codegen.empty();
        this.inputSchema = Codegen.empty();
        this.inputSchemaMapping = Codegen.empty();
        this.location = Codegen.empty();
        this.publicNetworkAccess = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.topicName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<InboundIpRuleArgs>> inboundIpRules;
        private @Nullable Output<Either<String,InputSchema>> inputSchema;
        private @Nullable Output<JsonInputSchemaMappingArgs> inputSchemaMapping;
        private @Nullable Output<String> location;
        private @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inboundIpRules = defaults.inboundIpRules;
    	      this.inputSchema = defaults.inputSchema;
    	      this.inputSchemaMapping = defaults.inputSchemaMapping;
    	      this.location = defaults.location;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.topicName = defaults.topicName;
        }

        public Builder inboundIpRules(@Nullable Output<List<InboundIpRuleArgs>> inboundIpRules) {
            this.inboundIpRules = inboundIpRules;
            return this;
        }
        public Builder inboundIpRules(@Nullable List<InboundIpRuleArgs> inboundIpRules) {
            this.inboundIpRules = Codegen.ofNullable(inboundIpRules);
            return this;
        }
        public Builder inboundIpRules(InboundIpRuleArgs... inboundIpRules) {
            return inboundIpRules(List.of(inboundIpRules));
        }
        public Builder inputSchema(@Nullable Output<Either<String,InputSchema>> inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }
        public Builder inputSchema(@Nullable Either<String,InputSchema> inputSchema) {
            this.inputSchema = Codegen.ofNullable(inputSchema);
            return this;
        }
        public Builder inputSchemaMapping(@Nullable Output<JsonInputSchemaMappingArgs> inputSchemaMapping) {
            this.inputSchemaMapping = inputSchemaMapping;
            return this;
        }
        public Builder inputSchemaMapping(@Nullable JsonInputSchemaMappingArgs inputSchemaMapping) {
            this.inputSchemaMapping = Codegen.ofNullable(inputSchemaMapping);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Codegen.ofNullable(publicNetworkAccess);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder topicName(@Nullable Output<String> topicName) {
            this.topicName = topicName;
            return this;
        }
        public Builder topicName(@Nullable String topicName) {
            this.topicName = Codegen.ofNullable(topicName);
            return this;
        }        public TopicArgs build() {
            return new TopicArgs(inboundIpRules, inputSchema, inputSchemaMapping, location, publicNetworkAccess, resourceGroupName, tags, topicName);
        }
    }
}
