// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.outputs.AggregationRule;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.outputs.PolicyRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterRole {
    /**
     * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
     * 
     */
    private final @Nullable AggregationRule aggregationRule;
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private final @Nullable String kind;
    /**
     * Standard object's metadata.
     * 
     */
    private final @Nullable ObjectMeta metadata;
    /**
     * Rules holds all the PolicyRules for this ClusterRole
     * 
     */
    private final @Nullable List<PolicyRule> rules;

    @OutputCustomType.Constructor
    private ClusterRole(
        @OutputCustomType.Parameter("aggregationRule") @Nullable AggregationRule aggregationRule,
        @OutputCustomType.Parameter("apiVersion") @Nullable String apiVersion,
        @OutputCustomType.Parameter("kind") @Nullable String kind,
        @OutputCustomType.Parameter("metadata") @Nullable ObjectMeta metadata,
        @OutputCustomType.Parameter("rules") @Nullable List<PolicyRule> rules) {
        this.aggregationRule = aggregationRule;
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.rules = rules;
    }

    /**
     * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
     * 
    */
    public Optional<AggregationRule> getAggregationRule() {
        return Optional.ofNullable(this.aggregationRule);
    }
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
    */
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Standard object's metadata.
     * 
    */
    public Optional<ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * Rules holds all the PolicyRules for this ClusterRole
     * 
    */
    public List<PolicyRule> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRole defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AggregationRule aggregationRule;
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable List<PolicyRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationRule = defaults.aggregationRule;
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.rules = defaults.rules;
        }

        public Builder aggregationRule(@Nullable AggregationRule aggregationRule) {
            this.aggregationRule = aggregationRule;
            return this;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder metadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder rules(@Nullable List<PolicyRule> rules) {
            this.rules = rules;
            return this;
        }
        public ClusterRole build() {
            return new ClusterRole(aggregationRule, apiVersion, kind, metadata, rules);
        }
    }
}
