// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specify which kustomizations must succeed reconciliation on the cluster prior to reconciling this kustomization
 * 
 */
public final class DependsOnDefinitionResponse extends com.pulumi.resources.InvokeArgs {

    public static final DependsOnDefinitionResponse Empty = new DependsOnDefinitionResponse();

    /**
     * Name of the kustomization to claim dependency on
     * 
     */
    @Import(name="kustomizationName")
    private @Nullable String kustomizationName;

    /**
     * @return Name of the kustomization to claim dependency on
     * 
     */
    public Optional<String> kustomizationName() {
        return Optional.ofNullable(this.kustomizationName);
    }

    private DependsOnDefinitionResponse() {}

    private DependsOnDefinitionResponse(DependsOnDefinitionResponse $) {
        this.kustomizationName = $.kustomizationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DependsOnDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DependsOnDefinitionResponse $;

        public Builder() {
            $ = new DependsOnDefinitionResponse();
        }

        public Builder(DependsOnDefinitionResponse defaults) {
            $ = new DependsOnDefinitionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param kustomizationName Name of the kustomization to claim dependency on
         * 
         * @return builder
         * 
         */
        public Builder kustomizationName(@Nullable String kustomizationName) {
            $.kustomizationName = kustomizationName;
            return this;
        }

        public DependsOnDefinitionResponse build() {
            return $;
        }
    }

}
