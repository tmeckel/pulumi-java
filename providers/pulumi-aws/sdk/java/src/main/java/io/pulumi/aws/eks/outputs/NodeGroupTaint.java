// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NodeGroupTaint {
    /**
     * The effect of the taint. Valid values: `NO_SCHEDULE`, `NO_EXECUTE`, `PREFER_NO_SCHEDULE`.
     * 
     */
    private final String effect;
    /**
     * The key of the taint. Maximum length of 63.
     * 
     */
    private final String key;
    /**
     * The value of the taint. Maximum length of 63.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor
    private NodeGroupTaint(
        @OutputCustomType.Parameter("effect") String effect,
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("value") @Nullable String value) {
        this.effect = effect;
        this.key = key;
        this.value = value;
    }

    /**
     * The effect of the taint. Valid values: `NO_SCHEDULE`, `NO_EXECUTE`, `PREFER_NO_SCHEDULE`.
     * 
    */
    public String getEffect() {
        return this.effect;
    }
    /**
     * The key of the taint. Maximum length of 63.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * The value of the taint. Maximum length of 63.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupTaint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String effect;
        private String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder effect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public NodeGroupTaint build() {
            return new NodeGroupTaint(effect, key, value);
        }
    }
}
