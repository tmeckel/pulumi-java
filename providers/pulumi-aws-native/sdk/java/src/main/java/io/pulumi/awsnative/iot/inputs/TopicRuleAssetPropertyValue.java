// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.TopicRuleAssetPropertyTimestamp;
import io.pulumi.awsnative.iot.inputs.TopicRuleAssetPropertyVariant;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleAssetPropertyValue extends io.pulumi.resources.InvokeArgs {

    public static final TopicRuleAssetPropertyValue Empty = new TopicRuleAssetPropertyValue();

    @InputImport(name="quality")
      private final @Nullable String quality;

    public Optional<String> getQuality() {
        return this.quality == null ? Optional.empty() : Optional.ofNullable(this.quality);
    }

    @InputImport(name="timestamp", required=true)
      private final TopicRuleAssetPropertyTimestamp timestamp;

    public TopicRuleAssetPropertyTimestamp getTimestamp() {
        return this.timestamp;
    }

    @InputImport(name="value", required=true)
      private final TopicRuleAssetPropertyVariant value;

    public TopicRuleAssetPropertyVariant getValue() {
        return this.value;
    }

    public TopicRuleAssetPropertyValue(
        @Nullable String quality,
        TopicRuleAssetPropertyTimestamp timestamp,
        TopicRuleAssetPropertyVariant value) {
        this.quality = quality;
        this.timestamp = Objects.requireNonNull(timestamp, "expected parameter 'timestamp' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private TopicRuleAssetPropertyValue() {
        this.quality = null;
        this.timestamp = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleAssetPropertyValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String quality;
        private TopicRuleAssetPropertyTimestamp timestamp;
        private TopicRuleAssetPropertyVariant value;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleAssetPropertyValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quality = defaults.quality;
    	      this.timestamp = defaults.timestamp;
    	      this.value = defaults.value;
        }

        public Builder quality(@Nullable String quality) {
            this.quality = quality;
            return this;
        }

        public Builder timestamp(TopicRuleAssetPropertyTimestamp timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }

        public Builder value(TopicRuleAssetPropertyVariant value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public TopicRuleAssetPropertyValue build() {
            return new TopicRuleAssetPropertyValue(quality, timestamp, value);
        }
    }
}
