// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConsumerGroupResult {
    /**
     * Exact time the message was created.
     * 
     */
    private final String createdAt;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * The exact time the message was updated.
     * 
     */
    private final String updatedAt;
    /**
     * User Metadata is a placeholder to store user-defined string data with maximum length 1024. e.g. it can be used to store descriptive data, such as list of teams and their contact information also user-defined configuration settings can be stored.
     * 
     */
    private final @Nullable String userMetadata;

    @OutputCustomType.Constructor
    private GetConsumerGroupResult(
        @OutputCustomType.Parameter("createdAt") String createdAt,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("updatedAt") String updatedAt,
        @OutputCustomType.Parameter("userMetadata") @Nullable String userMetadata) {
        this.createdAt = createdAt;
        this.id = id;
        this.name = name;
        this.type = type;
        this.updatedAt = updatedAt;
        this.userMetadata = userMetadata;
    }

    /**
     * Exact time the message was created.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The exact time the message was updated.
     * 
    */
    public String getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * User Metadata is a placeholder to store user-defined string data with maximum length 1024. e.g. it can be used to store descriptive data, such as list of teams and their contact information also user-defined configuration settings can be stored.
     * 
    */
    public Optional<String> getUserMetadata() {
        return Optional.ofNullable(this.userMetadata);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConsumerGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String id;
        private String name;
        private String type;
        private String updatedAt;
        private @Nullable String userMetadata;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConsumerGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
    	      this.userMetadata = defaults.userMetadata;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }

        public Builder userMetadata(@Nullable String userMetadata) {
            this.userMetadata = userMetadata;
            return this;
        }
        public GetConsumerGroupResult build() {
            return new GetConsumerGroupResult(createdAt, id, name, type, updatedAt, userMetadata);
        }
    }
}
