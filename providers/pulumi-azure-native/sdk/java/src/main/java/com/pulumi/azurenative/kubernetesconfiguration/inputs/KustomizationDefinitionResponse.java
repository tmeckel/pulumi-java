// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration.inputs;

import com.pulumi.azurenative.kubernetesconfiguration.inputs.DependsOnDefinitionResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Kustomization defining how to reconcile the artifact pulled by the source type on the cluster.
 * 
 */
public final class KustomizationDefinitionResponse extends com.pulumi.resources.InvokeArgs {

    public static final KustomizationDefinitionResponse Empty = new KustomizationDefinitionResponse();

    /**
     * Specifies other Kustomizations that this Kustomization depends on. This Kustomization will not reconcile until all dependencies have completed their reconciliation.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable List<DependsOnDefinitionResponse> dependsOn;

    /**
     * @return Specifies other Kustomizations that this Kustomization depends on. This Kustomization will not reconcile until all dependencies have completed their reconciliation.
     * 
     */
    public Optional<List<DependsOnDefinitionResponse>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to an immutable field change.
     * 
     */
    @Import(name="force")
    private @Nullable Boolean force;

    /**
     * @return Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to an immutable field change.
     * 
     */
    public Optional<Boolean> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * The path in the source reference to reconcile on the cluster.
     * 
     */
    @Import(name="path")
    private @Nullable String path;

    /**
     * @return The path in the source reference to reconcile on the cluster.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
     * 
     */
    @Import(name="prune")
    private @Nullable Boolean prune;

    /**
     * @return Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
     * 
     */
    public Optional<Boolean> prune() {
        return Optional.ofNullable(this.prune);
    }

    /**
     * The interval at which to re-reconcile the Kustomization on the cluster in the event of failure on reconciliation.
     * 
     */
    @Import(name="retryIntervalInSeconds")
    private @Nullable Double retryIntervalInSeconds;

    /**
     * @return The interval at which to re-reconcile the Kustomization on the cluster in the event of failure on reconciliation.
     * 
     */
    public Optional<Double> retryIntervalInSeconds() {
        return Optional.ofNullable(this.retryIntervalInSeconds);
    }

    /**
     * The interval at which to re-reconcile the Kustomization on the cluster.
     * 
     */
    @Import(name="syncIntervalInSeconds")
    private @Nullable Double syncIntervalInSeconds;

    /**
     * @return The interval at which to re-reconcile the Kustomization on the cluster.
     * 
     */
    public Optional<Double> syncIntervalInSeconds() {
        return Optional.ofNullable(this.syncIntervalInSeconds);
    }

    /**
     * The maximum time to attempt to reconcile the Kustomization on the cluster.
     * 
     */
    @Import(name="timeoutInSeconds")
    private @Nullable Double timeoutInSeconds;

    /**
     * @return The maximum time to attempt to reconcile the Kustomization on the cluster.
     * 
     */
    public Optional<Double> timeoutInSeconds() {
        return Optional.ofNullable(this.timeoutInSeconds);
    }

    /**
     * Specify whether to validate the Kubernetes objects referenced in the Kustomization before applying them to the cluster.
     * 
     */
    @Import(name="validation")
    private @Nullable String validation;

    /**
     * @return Specify whether to validate the Kubernetes objects referenced in the Kustomization before applying them to the cluster.
     * 
     */
    public Optional<String> validation() {
        return Optional.ofNullable(this.validation);
    }

    private KustomizationDefinitionResponse() {}

    private KustomizationDefinitionResponse(KustomizationDefinitionResponse $) {
        this.dependsOn = $.dependsOn;
        this.force = $.force;
        this.path = $.path;
        this.prune = $.prune;
        this.retryIntervalInSeconds = $.retryIntervalInSeconds;
        this.syncIntervalInSeconds = $.syncIntervalInSeconds;
        this.timeoutInSeconds = $.timeoutInSeconds;
        this.validation = $.validation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KustomizationDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KustomizationDefinitionResponse $;

        public Builder() {
            $ = new KustomizationDefinitionResponse();
        }

        public Builder(KustomizationDefinitionResponse defaults) {
            $ = new KustomizationDefinitionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param dependsOn Specifies other Kustomizations that this Kustomization depends on. This Kustomization will not reconcile until all dependencies have completed their reconciliation.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(@Nullable List<DependsOnDefinitionResponse> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        /**
         * @param dependsOn Specifies other Kustomizations that this Kustomization depends on. This Kustomization will not reconcile until all dependencies have completed their reconciliation.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(DependsOnDefinitionResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        /**
         * @param force Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to an immutable field change.
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Boolean force) {
            $.force = force;
            return this;
        }

        /**
         * @param path The path in the source reference to reconcile on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable String path) {
            $.path = path;
            return this;
        }

        /**
         * @param prune Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
         * 
         * @return builder
         * 
         */
        public Builder prune(@Nullable Boolean prune) {
            $.prune = prune;
            return this;
        }

        /**
         * @param retryIntervalInSeconds The interval at which to re-reconcile the Kustomization on the cluster in the event of failure on reconciliation.
         * 
         * @return builder
         * 
         */
        public Builder retryIntervalInSeconds(@Nullable Double retryIntervalInSeconds) {
            $.retryIntervalInSeconds = retryIntervalInSeconds;
            return this;
        }

        /**
         * @param syncIntervalInSeconds The interval at which to re-reconcile the Kustomization on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder syncIntervalInSeconds(@Nullable Double syncIntervalInSeconds) {
            $.syncIntervalInSeconds = syncIntervalInSeconds;
            return this;
        }

        /**
         * @param timeoutInSeconds The maximum time to attempt to reconcile the Kustomization on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder timeoutInSeconds(@Nullable Double timeoutInSeconds) {
            $.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        /**
         * @param validation Specify whether to validate the Kubernetes objects referenced in the Kustomization before applying them to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder validation(@Nullable String validation) {
            $.validation = validation;
            return this;
        }

        public KustomizationDefinitionResponse build() {
            $.force = Codegen.booleanProp("force").arg($.force).def(false).getNullable();
            $.path = Codegen.stringProp("path").arg($.path).def("").getNullable();
            $.prune = Codegen.booleanProp("prune").arg($.prune).def(false).getNullable();
            $.syncIntervalInSeconds = Codegen.doubleProp("syncIntervalInSeconds").arg($.syncIntervalInSeconds).def(6e+02).getNullable();
            $.timeoutInSeconds = Codegen.doubleProp("timeoutInSeconds").arg($.timeoutInSeconds).def(6e+02).getNullable();
            return $;
        }
    }

}
