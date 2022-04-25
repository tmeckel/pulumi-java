// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomResourceDefinitionNames {
    /**
     * @return categories is a list of grouped resources this custom resource belongs to (e.g. &#39;all&#39;). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
     * 
     */
    private final @Nullable List<String> categories;
    /**
     * @return kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.
     * 
     */
    private final String kind;
    /**
     * @return listKind is the serialized kind of the list for this resource. Defaults to &#34;`kind`List&#34;.
     * 
     */
    private final @Nullable String listKind;
    /**
     * @return plural is the plural name of the resource to serve. The custom resources are served under `/apis/&lt;group&gt;/&lt;version&gt;/.../&lt;plural&gt;`. Must match the name of the CustomResourceDefinition (in the form `&lt;names.plural&gt;.&lt;group&gt;`). Must be all lowercase.
     * 
     */
    private final String plural;
    /**
     * @return shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get &lt;shortname&gt;`. It must be all lowercase.
     * 
     */
    private final @Nullable List<String> shortNames;
    /**
     * @return singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.
     * 
     */
    private final @Nullable String singular;

    @CustomType.Constructor
    private CustomResourceDefinitionNames(
        @CustomType.Parameter("categories") @Nullable List<String> categories,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("listKind") @Nullable String listKind,
        @CustomType.Parameter("plural") String plural,
        @CustomType.Parameter("shortNames") @Nullable List<String> shortNames,
        @CustomType.Parameter("singular") @Nullable String singular) {
        this.categories = categories;
        this.kind = kind;
        this.listKind = listKind;
        this.plural = plural;
        this.shortNames = shortNames;
        this.singular = singular;
    }

    /**
     * @return categories is a list of grouped resources this custom resource belongs to (e.g. &#39;all&#39;). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
     * 
     */
    public List<String> categories() {
        return this.categories == null ? List.of() : this.categories;
    }
    /**
     * @return kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return listKind is the serialized kind of the list for this resource. Defaults to &#34;`kind`List&#34;.
     * 
     */
    public Optional<String> listKind() {
        return Optional.ofNullable(this.listKind);
    }
    /**
     * @return plural is the plural name of the resource to serve. The custom resources are served under `/apis/&lt;group&gt;/&lt;version&gt;/.../&lt;plural&gt;`. Must match the name of the CustomResourceDefinition (in the form `&lt;names.plural&gt;.&lt;group&gt;`). Must be all lowercase.
     * 
     */
    public String plural() {
        return this.plural;
    }
    /**
     * @return shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get &lt;shortname&gt;`. It must be all lowercase.
     * 
     */
    public List<String> shortNames() {
        return this.shortNames == null ? List.of() : this.shortNames;
    }
    /**
     * @return singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.
     * 
     */
    public Optional<String> singular() {
        return Optional.ofNullable(this.singular);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionNames defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> categories;
        private String kind;
        private @Nullable String listKind;
        private String plural;
        private @Nullable List<String> shortNames;
        private @Nullable String singular;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionNames defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.kind = defaults.kind;
    	      this.listKind = defaults.listKind;
    	      this.plural = defaults.plural;
    	      this.shortNames = defaults.shortNames;
    	      this.singular = defaults.singular;
        }

        public Builder categories(@Nullable List<String> categories) {
            this.categories = categories;
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder listKind(@Nullable String listKind) {
            this.listKind = listKind;
            return this;
        }
        public Builder plural(String plural) {
            this.plural = Objects.requireNonNull(plural);
            return this;
        }
        public Builder shortNames(@Nullable List<String> shortNames) {
            this.shortNames = shortNames;
            return this;
        }
        public Builder shortNames(String... shortNames) {
            return shortNames(List.of(shortNames));
        }
        public Builder singular(@Nullable String singular) {
            this.singular = singular;
            return this;
        }        public CustomResourceDefinitionNames build() {
            return new CustomResourceDefinitionNames(categories, kind, listKind, plural, shortNames, singular);
        }
    }
}
