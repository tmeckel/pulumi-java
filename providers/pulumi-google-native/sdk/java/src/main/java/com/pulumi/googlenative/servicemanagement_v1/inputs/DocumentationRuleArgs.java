// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A documentation rule provides information about individual API elements.
 * 
 */
public final class DocumentationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DocumentationRuleArgs Empty = new DocumentationRuleArgs();

    /**
     * Deprecation description of the selected element(s). It can be provided if an element is marked as `deprecated`.
     * 
     */
    @Import(name="deprecationDescription")
    private @Nullable Output<String> deprecationDescription;

    /**
     * @return Deprecation description of the selected element(s). It can be provided if an element is marked as `deprecated`.
     * 
     */
    public Optional<Output<String>> deprecationDescription() {
        return Optional.ofNullable(this.deprecationDescription);
    }

    /**
     * Description of the selected proto element (e.g. a message, a method, a &#39;service&#39; definition, or a field). Defaults to leading &amp; trailing comments taken from the proto source definition of the proto element.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the selected proto element (e.g. a message, a method, a &#39;service&#39; definition, or a field). Defaults to leading &amp; trailing comments taken from the proto source definition of the proto element.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The selector is a comma-separated list of patterns for any element such as a method, a field, an enum value. Each pattern is a qualified name of the element which may end in &#34;*&#34;, indicating a wildcard. Wildcards are only allowed at the end and for a whole component of the qualified name, i.e. &#34;foo.*&#34; is ok, but not &#34;foo.b*&#34; or &#34;foo.*.bar&#34;. A wildcard will match one or more components. To specify a default for all applicable elements, the whole pattern &#34;*&#34; is used.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<String> selector;

    /**
     * @return The selector is a comma-separated list of patterns for any element such as a method, a field, an enum value. Each pattern is a qualified name of the element which may end in &#34;*&#34;, indicating a wildcard. Wildcards are only allowed at the end and for a whole component of the qualified name, i.e. &#34;foo.*&#34; is ok, but not &#34;foo.b*&#34; or &#34;foo.*.bar&#34;. A wildcard will match one or more components. To specify a default for all applicable elements, the whole pattern &#34;*&#34; is used.
     * 
     */
    public Optional<Output<String>> selector() {
        return Optional.ofNullable(this.selector);
    }

    private DocumentationRuleArgs() {}

    private DocumentationRuleArgs(DocumentationRuleArgs $) {
        this.deprecationDescription = $.deprecationDescription;
        this.description = $.description;
        this.selector = $.selector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentationRuleArgs $;

        public Builder() {
            $ = new DocumentationRuleArgs();
        }

        public Builder(DocumentationRuleArgs defaults) {
            $ = new DocumentationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deprecationDescription Deprecation description of the selected element(s). It can be provided if an element is marked as `deprecated`.
         * 
         * @return builder
         * 
         */
        public Builder deprecationDescription(@Nullable Output<String> deprecationDescription) {
            $.deprecationDescription = deprecationDescription;
            return this;
        }

        /**
         * @param deprecationDescription Deprecation description of the selected element(s). It can be provided if an element is marked as `deprecated`.
         * 
         * @return builder
         * 
         */
        public Builder deprecationDescription(String deprecationDescription) {
            return deprecationDescription(Output.of(deprecationDescription));
        }

        /**
         * @param description Description of the selected proto element (e.g. a message, a method, a &#39;service&#39; definition, or a field). Defaults to leading &amp; trailing comments taken from the proto source definition of the proto element.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the selected proto element (e.g. a message, a method, a &#39;service&#39; definition, or a field). Defaults to leading &amp; trailing comments taken from the proto source definition of the proto element.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param selector The selector is a comma-separated list of patterns for any element such as a method, a field, an enum value. Each pattern is a qualified name of the element which may end in &#34;*&#34;, indicating a wildcard. Wildcards are only allowed at the end and for a whole component of the qualified name, i.e. &#34;foo.*&#34; is ok, but not &#34;foo.b*&#34; or &#34;foo.*.bar&#34;. A wildcard will match one or more components. To specify a default for all applicable elements, the whole pattern &#34;*&#34; is used.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<String> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector The selector is a comma-separated list of patterns for any element such as a method, a field, an enum value. Each pattern is a qualified name of the element which may end in &#34;*&#34;, indicating a wildcard. Wildcards are only allowed at the end and for a whole component of the qualified name, i.e. &#34;foo.*&#34; is ok, but not &#34;foo.b*&#34; or &#34;foo.*.bar&#34;. A wildcard will match one or more components. To specify a default for all applicable elements, the whole pattern &#34;*&#34; is used.
         * 
         * @return builder
         * 
         */
        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        public DocumentationRuleArgs build() {
            return $;
        }
    }

}
