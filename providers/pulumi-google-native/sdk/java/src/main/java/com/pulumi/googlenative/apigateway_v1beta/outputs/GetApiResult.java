// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetApiResult {
    /**
     * @return Created time.
     * 
     */
    private final String createTime;
    /**
     * @return Optional. Display name.
     * 
     */
    private final String displayName;
    /**
     * @return Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Optional. Immutable. The name of a Google Managed Service ( https://cloud.google.com/service-infrastructure/docs/glossary#managed). If not specified, a new Service will automatically be created in the same project as this API.
     * 
     */
    private final String managedService;
    /**
     * @return Resource name of the API. Format: projects/{project}/locations/global/apis/{api}
     * 
     */
    private final String name;
    /**
     * @return State of the API.
     * 
     */
    private final String state;
    /**
     * @return Updated time.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetApiResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("managedService") String managedService,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.displayName = displayName;
        this.labels = labels;
        this.managedService = managedService;
        this.name = name;
        this.state = state;
        this.updateTime = updateTime;
    }

    /**
     * @return Created time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Optional. Display name.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Optional. Immutable. The name of a Google Managed Service ( https://cloud.google.com/service-infrastructure/docs/glossary#managed). If not specified, a new Service will automatically be created in the same project as this API.
     * 
     */
    public String managedService() {
        return this.managedService;
    }
    /**
     * @return Resource name of the API. Format: projects/{project}/locations/global/apis/{api}
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return State of the API.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Updated time.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String displayName;
        private Map<String,String> labels;
        private String managedService;
        private String name;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.managedService = defaults.managedService;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder managedService(String managedService) {
            this.managedService = Objects.requireNonNull(managedService);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetApiResult build() {
            return new GetApiResult(createTime, displayName, labels, managedService, name, state, updateTime);
        }
    }
}
