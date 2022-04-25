// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration.inputs;

import com.pulumi.azurenative.kubernetesconfiguration.inputs.ScopeClusterResponse;
import com.pulumi.azurenative.kubernetesconfiguration.inputs.ScopeNamespaceResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Scope of the extensionInstance. It can be either Cluster or Namespace; but not both.
 * 
 */
public final class ScopeResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScopeResponse Empty = new ScopeResponse();

    /**
     * Specifies that the scope of the extensionInstance is Cluster
     * 
     */
    @Import(name="cluster")
    private @Nullable ScopeClusterResponse cluster;

    /**
     * @return Specifies that the scope of the extensionInstance is Cluster
     * 
     */
    public Optional<ScopeClusterResponse> cluster() {
        return Optional.ofNullable(this.cluster);
    }

    /**
     * Specifies that the scope of the extensionInstance is Namespace
     * 
     */
    @Import(name="namespace")
    private @Nullable ScopeNamespaceResponse namespace;

    /**
     * @return Specifies that the scope of the extensionInstance is Namespace
     * 
     */
    public Optional<ScopeNamespaceResponse> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private ScopeResponse() {}

    private ScopeResponse(ScopeResponse $) {
        this.cluster = $.cluster;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScopeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScopeResponse $;

        public Builder() {
            $ = new ScopeResponse();
        }

        public Builder(ScopeResponse defaults) {
            $ = new ScopeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param cluster Specifies that the scope of the extensionInstance is Cluster
         * 
         * @return builder
         * 
         */
        public Builder cluster(@Nullable ScopeClusterResponse cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param namespace Specifies that the scope of the extensionInstance is Namespace
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable ScopeNamespaceResponse namespace) {
            $.namespace = namespace;
            return this;
        }

        public ScopeResponse build() {
            return $;
        }
    }

}
