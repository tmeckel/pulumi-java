// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBrokerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBrokerArgs Empty = new GetBrokerArgs();

    /**
     * The unique id of the mq broker.
     * 
     */
    @InputImport(name="brokerId")
      private final @Nullable String brokerId;

    public Optional<String> getBrokerId() {
        return this.brokerId == null ? Optional.empty() : Optional.ofNullable(this.brokerId);
    }

    /**
     * The unique name of the mq broker.
     * 
     */
    @InputImport(name="brokerName")
      private final @Nullable String brokerName;

    public Optional<String> getBrokerName() {
        return this.brokerName == null ? Optional.empty() : Optional.ofNullable(this.brokerName);
    }

    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetBrokerArgs(
        @Nullable String brokerId,
        @Nullable String brokerName,
        @Nullable Map<String,String> tags) {
        this.brokerId = brokerId;
        this.brokerName = brokerName;
        this.tags = tags;
    }

    private GetBrokerArgs() {
        this.brokerId = null;
        this.brokerName = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String brokerId;
        private @Nullable String brokerName;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBrokerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brokerId = defaults.brokerId;
    	      this.brokerName = defaults.brokerName;
    	      this.tags = defaults.tags;
        }

        public Builder brokerId(@Nullable String brokerId) {
            this.brokerId = brokerId;
            return this;
        }

        public Builder brokerName(@Nullable String brokerName) {
            this.brokerName = brokerName;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetBrokerArgs build() {
            return new GetBrokerArgs(brokerId, brokerName, tags);
        }
    }
}
