// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.DataFlowResponseFolder;
import com.pulumi.azurenative.datafactory.inputs.PowerQuerySourceResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Power Query data flow.
 * 
 */
public final class WranglingDataFlowResponse extends com.pulumi.resources.InvokeArgs {

    public static final WranglingDataFlowResponse Empty = new WranglingDataFlowResponse();

    /**
     * List of tags that can be used for describing the data flow.
     * 
     */
    @Import(name="annotations")
    private @Nullable List<Object> annotations;

    /**
     * @return List of tags that can be used for describing the data flow.
     * 
     */
    public Optional<List<Object>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The description of the data flow.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return The description of the data flow.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Locale of the Power query mashup document.
     * 
     */
    @Import(name="documentLocale")
    private @Nullable String documentLocale;

    /**
     * @return Locale of the Power query mashup document.
     * 
     */
    public Optional<String> documentLocale() {
        return Optional.ofNullable(this.documentLocale);
    }

    /**
     * The folder that this data flow is in. If not specified, Data flow will appear at the root level.
     * 
     */
    @Import(name="folder")
    private @Nullable DataFlowResponseFolder folder;

    /**
     * @return The folder that this data flow is in. If not specified, Data flow will appear at the root level.
     * 
     */
    public Optional<DataFlowResponseFolder> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * Power query mashup script.
     * 
     */
    @Import(name="script")
    private @Nullable String script;

    /**
     * @return Power query mashup script.
     * 
     */
    public Optional<String> script() {
        return Optional.ofNullable(this.script);
    }

    /**
     * List of sources in Power Query.
     * 
     */
    @Import(name="sources")
    private @Nullable List<PowerQuerySourceResponse> sources;

    /**
     * @return List of sources in Power Query.
     * 
     */
    public Optional<List<PowerQuerySourceResponse>> sources() {
        return Optional.ofNullable(this.sources);
    }

    /**
     * Type of data flow.
     * Expected value is &#39;WranglingDataFlow&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of data flow.
     * Expected value is &#39;WranglingDataFlow&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private WranglingDataFlowResponse() {}

    private WranglingDataFlowResponse(WranglingDataFlowResponse $) {
        this.annotations = $.annotations;
        this.description = $.description;
        this.documentLocale = $.documentLocale;
        this.folder = $.folder;
        this.script = $.script;
        this.sources = $.sources;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WranglingDataFlowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WranglingDataFlowResponse $;

        public Builder() {
            $ = new WranglingDataFlowResponse();
        }

        public Builder(WranglingDataFlowResponse defaults) {
            $ = new WranglingDataFlowResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations List of tags that can be used for describing the data flow.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the data flow.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param description The description of the data flow.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param documentLocale Locale of the Power query mashup document.
         * 
         * @return builder
         * 
         */
        public Builder documentLocale(@Nullable String documentLocale) {
            $.documentLocale = documentLocale;
            return this;
        }

        /**
         * @param folder The folder that this data flow is in. If not specified, Data flow will appear at the root level.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable DataFlowResponseFolder folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param script Power query mashup script.
         * 
         * @return builder
         * 
         */
        public Builder script(@Nullable String script) {
            $.script = script;
            return this;
        }

        /**
         * @param sources List of sources in Power Query.
         * 
         * @return builder
         * 
         */
        public Builder sources(@Nullable List<PowerQuerySourceResponse> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources List of sources in Power Query.
         * 
         * @return builder
         * 
         */
        public Builder sources(PowerQuerySourceResponse... sources) {
            return sources(List.of(sources));
        }

        /**
         * @param type Type of data flow.
         * Expected value is &#39;WranglingDataFlow&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public WranglingDataFlowResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
