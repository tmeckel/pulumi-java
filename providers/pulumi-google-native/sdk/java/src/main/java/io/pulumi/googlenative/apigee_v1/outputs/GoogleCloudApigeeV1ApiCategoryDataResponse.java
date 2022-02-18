// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1ApiCategoryDataResponse {
    /**
     * Name of the category.
     * 
     */
    private final String name;
    /**
     * Name of the portal.
     * 
     */
    private final String siteId;
    /**
     * Time the category was last modified in milliseconds since epoch.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"name","siteId","updateTime"})
    private GoogleCloudApigeeV1ApiCategoryDataResponse(
        String name,
        String siteId,
        String updateTime) {
        this.name = Objects.requireNonNull(name);
        this.siteId = Objects.requireNonNull(siteId);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * Name of the category.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Name of the portal.
     * 
     */
    public String getSiteId() {
        return this.siteId;
    }
    /**
     * Time the category was last modified in milliseconds since epoch.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1ApiCategoryDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String siteId;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1ApiCategoryDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.siteId = defaults.siteId;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSiteId(String siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GoogleCloudApigeeV1ApiCategoryDataResponse build() {
            return new GoogleCloudApigeeV1ApiCategoryDataResponse(name, siteId, updateTime);
        }
    }
}
