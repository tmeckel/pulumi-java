// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.enums.NodeTaintEffect;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Kubernetes taint is comprised of three fields: key, value, and effect. Effect can only be one of three types: NoSchedule, PreferNoSchedule or NoExecute. See [here](https://kubernetes.io/docs/concepts/configuration/taint-and-toleration) for more information, including usage and the valid values.
 * 
 */
public final class NodeTaintArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeTaintArgs Empty = new NodeTaintArgs();

    /**
     * Effect for taint.
     * 
     */
    @InputImport(name="effect")
    private final @Nullable Input<NodeTaintEffect> effect;

    public Input<NodeTaintEffect> getEffect() {
        return this.effect == null ? Input.empty() : this.effect;
    }

    /**
     * Key for taint.
     * 
     */
    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * Value for taint.
     * 
     */
    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public NodeTaintArgs(
        @Nullable Input<NodeTaintEffect> effect,
        @Nullable Input<String> key,
        @Nullable Input<String> value) {
        this.effect = effect;
        this.key = key;
        this.value = value;
    }

    private NodeTaintArgs() {
        this.effect = Input.empty();
        this.key = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTaintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NodeTaintEffect> effect;
        private @Nullable Input<String> key;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTaintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setEffect(@Nullable Input<NodeTaintEffect> effect) {
            this.effect = effect;
            return this;
        }

        public Builder setEffect(@Nullable NodeTaintEffect effect) {
            this.effect = Input.ofNullable(effect);
            return this;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public NodeTaintArgs build() {
            return new NodeTaintArgs(effect, key, value);
        }
    }
}
