// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.ConfigMapNodeConfigSourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding metadata) must be non-nil. This API is deprecated since 1.22
 * 
 */
public final class NodeConfigSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeConfigSourceArgs Empty = new NodeConfigSourceArgs();

    /**
     * ConfigMap is a reference to a Node&#39;s ConfigMap
     * 
     */
    @Import(name="configMap")
    private @Nullable Output<ConfigMapNodeConfigSourceArgs> configMap;

    /**
     * @return ConfigMap is a reference to a Node&#39;s ConfigMap
     * 
     */
    public Optional<Output<ConfigMapNodeConfigSourceArgs>> configMap() {
        return Optional.ofNullable(this.configMap);
    }

    private NodeConfigSourceArgs() {}

    private NodeConfigSourceArgs(NodeConfigSourceArgs $) {
        this.configMap = $.configMap;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeConfigSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeConfigSourceArgs $;

        public Builder() {
            $ = new NodeConfigSourceArgs();
        }

        public Builder(NodeConfigSourceArgs defaults) {
            $ = new NodeConfigSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configMap ConfigMap is a reference to a Node&#39;s ConfigMap
         * 
         * @return builder
         * 
         */
        public Builder configMap(@Nullable Output<ConfigMapNodeConfigSourceArgs> configMap) {
            $.configMap = configMap;
            return this;
        }

        /**
         * @param configMap ConfigMap is a reference to a Node&#39;s ConfigMap
         * 
         * @return builder
         * 
         */
        public Builder configMap(ConfigMapNodeConfigSourceArgs configMap) {
            return configMap(Output.of(configMap));
        }

        public NodeConfigSourceArgs build() {
            return $;
        }
    }

}
