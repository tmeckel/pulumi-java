// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.azurenative.machinelearning.inputs.WebServiceParameterResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies a node in the web service graph. The node can either be an input, output or asset node, so only one of the corresponding id properties is populated at any given time.
 * 
 */
public final class GraphNodeResponse extends com.pulumi.resources.InvokeArgs {

    public static final GraphNodeResponse Empty = new GraphNodeResponse();

    /**
     * The id of the asset represented by this node.
     * 
     */
    @Import(name="assetId")
    private @Nullable String assetId;

    /**
     * @return The id of the asset represented by this node.
     * 
     */
    public Optional<String> assetId() {
        return Optional.ofNullable(this.assetId);
    }

    /**
     * The id of the input element represented by this node.
     * 
     */
    @Import(name="inputId")
    private @Nullable String inputId;

    /**
     * @return The id of the input element represented by this node.
     * 
     */
    public Optional<String> inputId() {
        return Optional.ofNullable(this.inputId);
    }

    /**
     * The id of the output element represented by this node.
     * 
     */
    @Import(name="outputId")
    private @Nullable String outputId;

    /**
     * @return The id of the output element represented by this node.
     * 
     */
    public Optional<String> outputId() {
        return Optional.ofNullable(this.outputId);
    }

    /**
     * If applicable, parameters of the node. Global graph parameters map into these, with values set at runtime.
     * 
     */
    @Import(name="parameters")
    private @Nullable Map<String,WebServiceParameterResponse> parameters;

    /**
     * @return If applicable, parameters of the node. Global graph parameters map into these, with values set at runtime.
     * 
     */
    public Optional<Map<String,WebServiceParameterResponse>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private GraphNodeResponse() {}

    private GraphNodeResponse(GraphNodeResponse $) {
        this.assetId = $.assetId;
        this.inputId = $.inputId;
        this.outputId = $.outputId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphNodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphNodeResponse $;

        public Builder() {
            $ = new GraphNodeResponse();
        }

        public Builder(GraphNodeResponse defaults) {
            $ = new GraphNodeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param assetId The id of the asset represented by this node.
         * 
         * @return builder
         * 
         */
        public Builder assetId(@Nullable String assetId) {
            $.assetId = assetId;
            return this;
        }

        /**
         * @param inputId The id of the input element represented by this node.
         * 
         * @return builder
         * 
         */
        public Builder inputId(@Nullable String inputId) {
            $.inputId = inputId;
            return this;
        }

        /**
         * @param outputId The id of the output element represented by this node.
         * 
         * @return builder
         * 
         */
        public Builder outputId(@Nullable String outputId) {
            $.outputId = outputId;
            return this;
        }

        /**
         * @param parameters If applicable, parameters of the node. Global graph parameters map into these, with values set at runtime.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Map<String,WebServiceParameterResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        public GraphNodeResponse build() {
            return $;
        }
    }

}
