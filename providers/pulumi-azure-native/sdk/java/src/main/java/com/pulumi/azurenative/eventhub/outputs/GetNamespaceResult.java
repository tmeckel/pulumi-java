// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.outputs;

import com.pulumi.azurenative.eventhub.outputs.SkuResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNamespaceResult {
    /**
     * @return The time the Namespace was created.
     * 
     */
    private final String createdAt;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return Value that indicates whether AutoInflate is enabled for eventhub namespace.
     * 
     */
    private final @Nullable Boolean isAutoInflateEnabled;
    /**
     * @return Value that indicates whether Kafka is enabled for eventhub namespace.
     * 
     */
    private final @Nullable Boolean kafkaEnabled;
    /**
     * @return Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Upper limit of throughput units when AutoInflate is enabled, value should be within 0 to 20 throughput units. ( &#39;0&#39; if AutoInflateEnabled = true)
     * 
     */
    private final @Nullable Integer maximumThroughputUnits;
    /**
     * @return Identifier for Azure Insights metrics.
     * 
     */
    private final String metricId;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Provisioning state of the Namespace.
     * 
     */
    private final String provisioningState;
    /**
     * @return Endpoint you can use to perform Service Bus operations.
     * 
     */
    private final String serviceBusEndpoint;
    /**
     * @return Properties of sku resource
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;
    /**
     * @return The time the Namespace was updated.
     * 
     */
    private final String updatedAt;

    @CustomType.Constructor
    private GetNamespaceResult(
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isAutoInflateEnabled") @Nullable Boolean isAutoInflateEnabled,
        @CustomType.Parameter("kafkaEnabled") @Nullable Boolean kafkaEnabled,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("maximumThroughputUnits") @Nullable Integer maximumThroughputUnits,
        @CustomType.Parameter("metricId") String metricId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("serviceBusEndpoint") String serviceBusEndpoint,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updatedAt") String updatedAt) {
        this.createdAt = createdAt;
        this.id = id;
        this.isAutoInflateEnabled = isAutoInflateEnabled;
        this.kafkaEnabled = kafkaEnabled;
        this.location = location;
        this.maximumThroughputUnits = maximumThroughputUnits;
        this.metricId = metricId;
        this.name = name;
        this.provisioningState = provisioningState;
        this.serviceBusEndpoint = serviceBusEndpoint;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
        this.updatedAt = updatedAt;
    }

    /**
     * @return The time the Namespace was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Value that indicates whether AutoInflate is enabled for eventhub namespace.
     * 
     */
    public Optional<Boolean> isAutoInflateEnabled() {
        return Optional.ofNullable(this.isAutoInflateEnabled);
    }
    /**
     * @return Value that indicates whether Kafka is enabled for eventhub namespace.
     * 
     */
    public Optional<Boolean> kafkaEnabled() {
        return Optional.ofNullable(this.kafkaEnabled);
    }
    /**
     * @return Resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Upper limit of throughput units when AutoInflate is enabled, value should be within 0 to 20 throughput units. ( &#39;0&#39; if AutoInflateEnabled = true)
     * 
     */
    public Optional<Integer> maximumThroughputUnits() {
        return Optional.ofNullable(this.maximumThroughputUnits);
    }
    /**
     * @return Identifier for Azure Insights metrics.
     * 
     */
    public String metricId() {
        return this.metricId;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Provisioning state of the Namespace.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Endpoint you can use to perform Service Bus operations.
     * 
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }
    /**
     * @return Properties of sku resource
     * 
     */
    public Optional<SkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The time the Namespace was updated.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String id;
        private @Nullable Boolean isAutoInflateEnabled;
        private @Nullable Boolean kafkaEnabled;
        private @Nullable String location;
        private @Nullable Integer maximumThroughputUnits;
        private String metricId;
        private String name;
        private String provisioningState;
        private String serviceBusEndpoint;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private String updatedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.isAutoInflateEnabled = defaults.isAutoInflateEnabled;
    	      this.kafkaEnabled = defaults.kafkaEnabled;
    	      this.location = defaults.location;
    	      this.maximumThroughputUnits = defaults.maximumThroughputUnits;
    	      this.metricId = defaults.metricId;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.serviceBusEndpoint = defaults.serviceBusEndpoint;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isAutoInflateEnabled(@Nullable Boolean isAutoInflateEnabled) {
            this.isAutoInflateEnabled = isAutoInflateEnabled;
            return this;
        }
        public Builder kafkaEnabled(@Nullable Boolean kafkaEnabled) {
            this.kafkaEnabled = kafkaEnabled;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder maximumThroughputUnits(@Nullable Integer maximumThroughputUnits) {
            this.maximumThroughputUnits = maximumThroughputUnits;
            return this;
        }
        public Builder metricId(String metricId) {
            this.metricId = Objects.requireNonNull(metricId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder serviceBusEndpoint(String serviceBusEndpoint) {
            this.serviceBusEndpoint = Objects.requireNonNull(serviceBusEndpoint);
            return this;
        }
        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }        public GetNamespaceResult build() {
            return new GetNamespaceResult(createdAt, id, isAutoInflateEnabled, kafkaEnabled, location, maximumThroughputUnits, metricId, name, provisioningState, serviceBusEndpoint, sku, tags, type, updatedAt);
        }
    }
}
