// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscalingplans.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScalingPlanApplicationSourceTagFilter {
    /**
     * The tag key.
     * 
     */
    private final String key;
    /**
     * The tag values.
     * 
     */
    private final @Nullable List<String> values;

    @OutputCustomType.Constructor
    private ScalingPlanApplicationSourceTagFilter(
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("values") @Nullable List<String> values) {
        this.key = key;
        this.values = values;
    }

    /**
     * The tag key.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * The tag values.
     * 
    */
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanApplicationSourceTagFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanApplicationSourceTagFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public ScalingPlanApplicationSourceTagFilter build() {
            return new ScalingPlanApplicationSourceTagFilter(key, values);
        }
    }
}
