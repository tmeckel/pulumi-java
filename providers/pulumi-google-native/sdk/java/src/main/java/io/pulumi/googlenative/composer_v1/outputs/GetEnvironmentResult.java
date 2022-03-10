// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.composer_v1.outputs.EnvironmentConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetEnvironmentResult {
    /**
     * Configuration parameters for this environment.
     * 
     */
    private final EnvironmentConfigResponse config;
    /**
     * The time at which this environment was created.
     * 
     */
    private final String createTime;
    /**
     * Optional. User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map are UTF8 strings that comply with the following restrictions: * Keys must conform to regexp: \p{Ll}\p{Lo}{0,62} * Values must conform to regexp: [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally constrained to be <= 128 bytes in size.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource name of the environment, in the form: "projects/{projectId}/locations/{locationId}/environments/{environmentId}" EnvironmentId must start with a lowercase letter followed by up to 63 lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * 
     */
    private final String name;
    /**
     * The current state of the environment.
     * 
     */
    private final String state;
    /**
     * The time at which this environment was last modified.
     * 
     */
    private final String updateTime;
    /**
     * The UUID (Universally Unique IDentifier) associated with this environment. This value is generated when the environment is created.
     * 
     */
    private final String uuid;

    @OutputCustomType.Constructor
    private GetEnvironmentResult(
        @OutputCustomType.Parameter("config") EnvironmentConfigResponse config,
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("updateTime") String updateTime,
        @OutputCustomType.Parameter("uuid") String uuid) {
        this.config = config;
        this.createTime = createTime;
        this.labels = labels;
        this.name = name;
        this.state = state;
        this.updateTime = updateTime;
        this.uuid = uuid;
    }

    /**
     * Configuration parameters for this environment.
     * 
    */
    public EnvironmentConfigResponse getConfig() {
        return this.config;
    }
    /**
     * The time at which this environment was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map are UTF8 strings that comply with the following restrictions: * Keys must conform to regexp: \p{Ll}\p{Lo}{0,62} * Values must conform to regexp: [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally constrained to be <= 128 bytes in size.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the environment, in the form: "projects/{projectId}/locations/{locationId}/environments/{environmentId}" EnvironmentId must start with a lowercase letter followed by up to 63 lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The current state of the environment.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The time at which this environment was last modified.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * The UUID (Universally Unique IDentifier) associated with this environment. This value is generated when the environment is created.
     * 
    */
    public String getUuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentConfigResponse config;
        private String createTime;
        private Map<String,String> labels;
        private String name;
        private String state;
        private String updateTime;
        private String uuid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.createTime = defaults.createTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
    	      this.uuid = defaults.uuid;
        }

        public Builder config(EnvironmentConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
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
        }

        public Builder uuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }
        public GetEnvironmentResult build() {
            return new GetEnvironmentResult(config, createTime, labels, name, state, updateTime, uuid);
        }
    }
}
