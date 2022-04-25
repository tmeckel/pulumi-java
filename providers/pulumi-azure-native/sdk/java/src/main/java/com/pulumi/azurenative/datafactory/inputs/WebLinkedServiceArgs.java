// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.WebAnonymousAuthenticationArgs;
import com.pulumi.azurenative.datafactory.inputs.WebBasicAuthenticationArgs;
import com.pulumi.azurenative.datafactory.inputs.WebClientCertificateAuthenticationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Web linked service.
 * 
 */
public final class WebLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebLinkedServiceArgs Empty = new WebLinkedServiceArgs();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    /**
     * @return The integration runtime reference.
     * 
     */
    public Optional<Output<IntegrationRuntimeReferenceArgs>> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Linked service description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    /**
     * @return Parameters for linked service.
     * 
     */
    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;Web&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;Web&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Web linked service properties.
     * 
     */
    @Import(name="typeProperties", required=true)
    private Output<Object> typeProperties;

    /**
     * @return Web linked service properties.
     * 
     */
    public Output<Object> typeProperties() {
        return this.typeProperties;
    }

    private WebLinkedServiceArgs() {}

    private WebLinkedServiceArgs(WebLinkedServiceArgs $) {
        this.annotations = $.annotations;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.parameters = $.parameters;
        this.type = $.type;
        this.typeProperties = $.typeProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebLinkedServiceArgs $;

        public Builder() {
            $ = new WebLinkedServiceArgs();
        }

        public Builder(WebLinkedServiceArgs defaults) {
            $ = new WebLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param connectVia The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        /**
         * @param connectVia The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        /**
         * @param description Linked service description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Linked service description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param parameters Parameters for linked service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters for linked service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;Web&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;Web&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param typeProperties Web linked service properties.
         * 
         * @return builder
         * 
         */
        public Builder typeProperties(Output<Object> typeProperties) {
            $.typeProperties = typeProperties;
            return this;
        }

        /**
         * @param typeProperties Web linked service properties.
         * 
         * @return builder
         * 
         */
        public Builder typeProperties(Object typeProperties) {
            return typeProperties(Output.of(typeProperties));
        }

        public WebLinkedServiceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            $.typeProperties = Objects.requireNonNull($.typeProperties, "expected parameter 'typeProperties' to be non-null");
            return $;
        }
    }

}
