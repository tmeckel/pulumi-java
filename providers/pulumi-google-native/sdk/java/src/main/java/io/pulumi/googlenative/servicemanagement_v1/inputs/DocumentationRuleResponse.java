// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A documentation rule provides information about individual API elements.
 * 
 */
public final class DocumentationRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final DocumentationRuleResponse Empty = new DocumentationRuleResponse();

    /**
     * Deprecation description of the selected element(s). It can be provided if an element is marked as `deprecated`.
     * 
     */
    @InputImport(name="deprecationDescription", required=true)
    private final String deprecationDescription;

    public String getDeprecationDescription() {
        return this.deprecationDescription;
    }

    /**
     * Description of the selected proto element (e.g. a message, a method, a 'service' definition, or a field). Defaults to leading & trailing comments taken from the proto source definition of the proto element.
     * 
     */
    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The selector is a comma-separated list of patterns for any element such as a method, a field, an enum value. Each pattern is a qualified name of the element which may end in "*", indicating a wildcard. Wildcards are only allowed at the end and for a whole component of the qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A wildcard will match one or more components. To specify a default for all applicable elements, the whole pattern "*" is used.
     * 
     */
    @InputImport(name="selector", required=true)
    private final String selector;

    public String getSelector() {
        return this.selector;
    }

    public DocumentationRuleResponse(
        String deprecationDescription,
        String description,
        String selector) {
        this.deprecationDescription = Objects.requireNonNull(deprecationDescription, "expected parameter 'deprecationDescription' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
    }

    private DocumentationRuleResponse() {
        this.deprecationDescription = null;
        this.description = null;
        this.selector = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentationRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deprecationDescription;
        private String description;
        private String selector;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentationRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deprecationDescription = defaults.deprecationDescription;
    	      this.description = defaults.description;
    	      this.selector = defaults.selector;
        }

        public Builder setDeprecationDescription(String deprecationDescription) {
            this.deprecationDescription = Objects.requireNonNull(deprecationDescription);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setSelector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public DocumentationRuleResponse build() {
            return new DocumentationRuleResponse(deprecationDescription, description, selector);
        }
    }
}
