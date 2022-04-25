// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1.outputs.CategoryResponse;
import com.pulumi.googlenative.containeranalysis_v1.outputs.IdentityResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WindowsUpdateResponse {
    /**
     * @return The list of categories to which the update belongs.
     * 
     */
    private final List<CategoryResponse> categories;
    /**
     * @return The localized description of the update.
     * 
     */
    private final String description;
    /**
     * @return Required - The unique identifier for the update.
     * 
     */
    private final IdentityResponse identity;
    /**
     * @return The Microsoft Knowledge Base article IDs that are associated with the update.
     * 
     */
    private final List<String> kbArticleIds;
    /**
     * @return The last published timestamp of the update.
     * 
     */
    private final String lastPublishedTimestamp;
    /**
     * @return The hyperlink to the support information for the update.
     * 
     */
    private final String supportUrl;
    /**
     * @return The localized title of the update.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private WindowsUpdateResponse(
        @CustomType.Parameter("categories") List<CategoryResponse> categories,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("identity") IdentityResponse identity,
        @CustomType.Parameter("kbArticleIds") List<String> kbArticleIds,
        @CustomType.Parameter("lastPublishedTimestamp") String lastPublishedTimestamp,
        @CustomType.Parameter("supportUrl") String supportUrl,
        @CustomType.Parameter("title") String title) {
        this.categories = categories;
        this.description = description;
        this.identity = identity;
        this.kbArticleIds = kbArticleIds;
        this.lastPublishedTimestamp = lastPublishedTimestamp;
        this.supportUrl = supportUrl;
        this.title = title;
    }

    /**
     * @return The list of categories to which the update belongs.
     * 
     */
    public List<CategoryResponse> categories() {
        return this.categories;
    }
    /**
     * @return The localized description of the update.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Required - The unique identifier for the update.
     * 
     */
    public IdentityResponse identity() {
        return this.identity;
    }
    /**
     * @return The Microsoft Knowledge Base article IDs that are associated with the update.
     * 
     */
    public List<String> kbArticleIds() {
        return this.kbArticleIds;
    }
    /**
     * @return The last published timestamp of the update.
     * 
     */
    public String lastPublishedTimestamp() {
        return this.lastPublishedTimestamp;
    }
    /**
     * @return The hyperlink to the support information for the update.
     * 
     */
    public String supportUrl() {
        return this.supportUrl;
    }
    /**
     * @return The localized title of the update.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsUpdateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CategoryResponse> categories;
        private String description;
        private IdentityResponse identity;
        private List<String> kbArticleIds;
        private String lastPublishedTimestamp;
        private String supportUrl;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsUpdateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.description = defaults.description;
    	      this.identity = defaults.identity;
    	      this.kbArticleIds = defaults.kbArticleIds;
    	      this.lastPublishedTimestamp = defaults.lastPublishedTimestamp;
    	      this.supportUrl = defaults.supportUrl;
    	      this.title = defaults.title;
        }

        public Builder categories(List<CategoryResponse> categories) {
            this.categories = Objects.requireNonNull(categories);
            return this;
        }
        public Builder categories(CategoryResponse... categories) {
            return categories(List.of(categories));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder identity(IdentityResponse identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }
        public Builder kbArticleIds(List<String> kbArticleIds) {
            this.kbArticleIds = Objects.requireNonNull(kbArticleIds);
            return this;
        }
        public Builder kbArticleIds(String... kbArticleIds) {
            return kbArticleIds(List.of(kbArticleIds));
        }
        public Builder lastPublishedTimestamp(String lastPublishedTimestamp) {
            this.lastPublishedTimestamp = Objects.requireNonNull(lastPublishedTimestamp);
            return this;
        }
        public Builder supportUrl(String supportUrl) {
            this.supportUrl = Objects.requireNonNull(supportUrl);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public WindowsUpdateResponse build() {
            return new WindowsUpdateResponse(categories, description, identity, kbArticleIds, lastPublishedTimestamp, supportUrl, title);
        }
    }
}
