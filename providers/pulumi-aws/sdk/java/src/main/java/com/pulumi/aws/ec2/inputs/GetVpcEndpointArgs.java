// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetVpcEndpointFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcEndpointArgs Empty = new GetVpcEndpointArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetVpcEndpointFilter> filters;

    /**
     * @return Custom filter block as described below.
     * 
     */
    public Optional<List<GetVpcEndpointFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The ID of the specific VPC Endpoint to retrieve.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of the specific VPC Endpoint to retrieve.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The service name of the specific VPC Endpoint to retrieve. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
     * 
     */
    @Import(name="serviceName")
    private @Nullable String serviceName;

    /**
     * @return The service name of the specific VPC Endpoint to retrieve. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
     * 
     */
    public Optional<String> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * The state of the specific VPC Endpoint to retrieve.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return The state of the specific VPC Endpoint to retrieve.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the specific VPC Endpoint to retrieve.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A map of tags, each pair of which must exactly match
     * a pair on the specific VPC Endpoint to retrieve.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the VPC in which the specific VPC Endpoint is used.
     * 
     */
    @Import(name="vpcId")
    private @Nullable String vpcId;

    /**
     * @return The ID of the VPC in which the specific VPC Endpoint is used.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private GetVpcEndpointArgs() {}

    private GetVpcEndpointArgs(GetVpcEndpointArgs $) {
        this.filters = $.filters;
        this.id = $.id;
        this.serviceName = $.serviceName;
        this.state = $.state;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcEndpointArgs $;

        public Builder() {
            $ = new GetVpcEndpointArgs();
        }

        public Builder(GetVpcEndpointArgs defaults) {
            $ = new GetVpcEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetVpcEndpointFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetVpcEndpointFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id The ID of the specific VPC Endpoint to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param serviceName The service name of the specific VPC Endpoint to retrieve. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param state The state of the specific VPC Endpoint to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param tags A map of tags, each pair of which must exactly match
         * a pair on the specific VPC Endpoint to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC in which the specific VPC Endpoint is used.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable String vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public GetVpcEndpointArgs build() {
            return $;
        }
    }

}
