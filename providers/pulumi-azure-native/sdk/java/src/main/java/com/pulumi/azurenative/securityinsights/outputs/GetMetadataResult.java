// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.outputs;

import com.pulumi.azurenative.securityinsights.outputs.MetadataAuthorResponse;
import com.pulumi.azurenative.securityinsights.outputs.MetadataCategoriesResponse;
import com.pulumi.azurenative.securityinsights.outputs.MetadataDependenciesResponse;
import com.pulumi.azurenative.securityinsights.outputs.MetadataSourceResponse;
import com.pulumi.azurenative.securityinsights.outputs.MetadataSupportResponse;
import com.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMetadataResult {
    /**
     * @return The creator of the content item.
     * 
     */
    private final @Nullable MetadataAuthorResponse author;
    /**
     * @return Categories for the solution content item
     * 
     */
    private final @Nullable MetadataCategoriesResponse categories;
    /**
     * @return Static ID for the content.  Used to identify dependencies and content from solutions or community.  Hard-coded/static for out of the box content and solutions. Dynamic for user-created.  This is the resource name
     * 
     */
    private final @Nullable String contentId;
    /**
     * @return Dependencies for the content item, what other content items it requires to work.  Can describe more complex dependencies using a recursive/nested structure. For a single dependency an id/kind/version can be supplied or operator/criteria for complex formats.
     * 
     */
    private final @Nullable MetadataDependenciesResponse dependencies;
    /**
     * @return Etag of the azure resource
     * 
     */
    private final @Nullable String etag;
    /**
     * @return first publish date solution content item
     * 
     */
    private final @Nullable String firstPublishDate;
    /**
     * @return Azure resource Id
     * 
     */
    private final String id;
    /**
     * @return The kind of content the metadata is for.
     * 
     */
    private final String kind;
    /**
     * @return last publish date for the solution content item
     * 
     */
    private final @Nullable String lastPublishDate;
    /**
     * @return Azure resource name
     * 
     */
    private final String name;
    /**
     * @return Full parent resource ID of the content item the metadata is for.  This is the full resource ID including the scope (subscription and resource group)
     * 
     */
    private final String parentId;
    /**
     * @return Providers for the solution content item
     * 
     */
    private final @Nullable List<String> providers;
    /**
     * @return Source of the content.  This is where/how it was created.
     * 
     */
    private final @Nullable MetadataSourceResponse source;
    /**
     * @return Support information for the metadata - type, name, contact information
     * 
     */
    private final @Nullable MetadataSupportResponse support;
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Azure resource type
     * 
     */
    private final String type;
    /**
     * @return Version of the content.  Default and recommended format is numeric (e.g. 1, 1.0, 1.0.0, 1.0.0.0), following ARM template best practices.  Can also be any string, but then we cannot guarantee any version checks
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private GetMetadataResult(
        @CustomType.Parameter("author") @Nullable MetadataAuthorResponse author,
        @CustomType.Parameter("categories") @Nullable MetadataCategoriesResponse categories,
        @CustomType.Parameter("contentId") @Nullable String contentId,
        @CustomType.Parameter("dependencies") @Nullable MetadataDependenciesResponse dependencies,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("firstPublishDate") @Nullable String firstPublishDate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("lastPublishDate") @Nullable String lastPublishDate,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parentId") String parentId,
        @CustomType.Parameter("providers") @Nullable List<String> providers,
        @CustomType.Parameter("source") @Nullable MetadataSourceResponse source,
        @CustomType.Parameter("support") @Nullable MetadataSupportResponse support,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") @Nullable String version) {
        this.author = author;
        this.categories = categories;
        this.contentId = contentId;
        this.dependencies = dependencies;
        this.etag = etag;
        this.firstPublishDate = firstPublishDate;
        this.id = id;
        this.kind = kind;
        this.lastPublishDate = lastPublishDate;
        this.name = name;
        this.parentId = parentId;
        this.providers = providers;
        this.source = source;
        this.support = support;
        this.systemData = systemData;
        this.type = type;
        this.version = version;
    }

    /**
     * @return The creator of the content item.
     * 
     */
    public Optional<MetadataAuthorResponse> author() {
        return Optional.ofNullable(this.author);
    }
    /**
     * @return Categories for the solution content item
     * 
     */
    public Optional<MetadataCategoriesResponse> categories() {
        return Optional.ofNullable(this.categories);
    }
    /**
     * @return Static ID for the content.  Used to identify dependencies and content from solutions or community.  Hard-coded/static for out of the box content and solutions. Dynamic for user-created.  This is the resource name
     * 
     */
    public Optional<String> contentId() {
        return Optional.ofNullable(this.contentId);
    }
    /**
     * @return Dependencies for the content item, what other content items it requires to work.  Can describe more complex dependencies using a recursive/nested structure. For a single dependency an id/kind/version can be supplied or operator/criteria for complex formats.
     * 
     */
    public Optional<MetadataDependenciesResponse> dependencies() {
        return Optional.ofNullable(this.dependencies);
    }
    /**
     * @return Etag of the azure resource
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * @return first publish date solution content item
     * 
     */
    public Optional<String> firstPublishDate() {
        return Optional.ofNullable(this.firstPublishDate);
    }
    /**
     * @return Azure resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The kind of content the metadata is for.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return last publish date for the solution content item
     * 
     */
    public Optional<String> lastPublishDate() {
        return Optional.ofNullable(this.lastPublishDate);
    }
    /**
     * @return Azure resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Full parent resource ID of the content item the metadata is for.  This is the full resource ID including the scope (subscription and resource group)
     * 
     */
    public String parentId() {
        return this.parentId;
    }
    /**
     * @return Providers for the solution content item
     * 
     */
    public List<String> providers() {
        return this.providers == null ? List.of() : this.providers;
    }
    /**
     * @return Source of the content.  This is where/how it was created.
     * 
     */
    public Optional<MetadataSourceResponse> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * @return Support information for the metadata - type, name, contact information
     * 
     */
    public Optional<MetadataSupportResponse> support() {
        return Optional.ofNullable(this.support);
    }
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Azure resource type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Version of the content.  Default and recommended format is numeric (e.g. 1, 1.0, 1.0.0, 1.0.0.0), following ARM template best practices.  Can also be any string, but then we cannot guarantee any version checks
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetadataResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MetadataAuthorResponse author;
        private @Nullable MetadataCategoriesResponse categories;
        private @Nullable String contentId;
        private @Nullable MetadataDependenciesResponse dependencies;
        private @Nullable String etag;
        private @Nullable String firstPublishDate;
        private String id;
        private String kind;
        private @Nullable String lastPublishDate;
        private String name;
        private String parentId;
        private @Nullable List<String> providers;
        private @Nullable MetadataSourceResponse source;
        private @Nullable MetadataSupportResponse support;
        private SystemDataResponse systemData;
        private String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetadataResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.author = defaults.author;
    	      this.categories = defaults.categories;
    	      this.contentId = defaults.contentId;
    	      this.dependencies = defaults.dependencies;
    	      this.etag = defaults.etag;
    	      this.firstPublishDate = defaults.firstPublishDate;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastPublishDate = defaults.lastPublishDate;
    	      this.name = defaults.name;
    	      this.parentId = defaults.parentId;
    	      this.providers = defaults.providers;
    	      this.source = defaults.source;
    	      this.support = defaults.support;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder author(@Nullable MetadataAuthorResponse author) {
            this.author = author;
            return this;
        }
        public Builder categories(@Nullable MetadataCategoriesResponse categories) {
            this.categories = categories;
            return this;
        }
        public Builder contentId(@Nullable String contentId) {
            this.contentId = contentId;
            return this;
        }
        public Builder dependencies(@Nullable MetadataDependenciesResponse dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder firstPublishDate(@Nullable String firstPublishDate) {
            this.firstPublishDate = firstPublishDate;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder lastPublishDate(@Nullable String lastPublishDate) {
            this.lastPublishDate = lastPublishDate;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parentId(String parentId) {
            this.parentId = Objects.requireNonNull(parentId);
            return this;
        }
        public Builder providers(@Nullable List<String> providers) {
            this.providers = providers;
            return this;
        }
        public Builder providers(String... providers) {
            return providers(List.of(providers));
        }
        public Builder source(@Nullable MetadataSourceResponse source) {
            this.source = source;
            return this;
        }
        public Builder support(@Nullable MetadataSupportResponse support) {
            this.support = support;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public GetMetadataResult build() {
            return new GetMetadataResult(author, categories, contentId, dependencies, etag, firstPublishDate, id, kind, lastPublishDate, name, parentId, providers, source, support, systemData, type, version);
        }
    }
}
