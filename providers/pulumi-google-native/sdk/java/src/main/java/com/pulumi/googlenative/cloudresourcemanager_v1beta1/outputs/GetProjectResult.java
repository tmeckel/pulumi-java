// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudresourcemanager_v1beta1.outputs.ResourceIdResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetProjectResult {
    /**
     * @return Creation time. Read-only.
     * 
     */
    private final String createTime;
    /**
     * @return The labels associated with this Project. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: a-z{0,62}. Label values must be between 0 and 63 characters long and must conform to the regular expression [a-z0-9_-]{0,63}. A label value can be empty. No more than 256 labels can be associated with a given resource. Clients should store labels in a representation such as JSON that does not depend on specific characters being disallowed. Example: `&#34;environment&#34; : &#34;dev&#34;` Read-write.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The Project lifecycle state. Read-only.
     * 
     */
    private final String lifecycleState;
    /**
     * @return The optional user-assigned display name of the Project. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, single-quote, double-quote, space, and exclamation point. Example: `My Project` Read-write.
     * 
     */
    private final String name;
    /**
     * @return An optional reference to a parent Resource. Supported parent types include &#34;organization&#34; and &#34;folder&#34;. Once set, the parent cannot be cleared. The `parent` can be set on creation or using the `UpdateProject` method; the end user must have the `resourcemanager.projects.create` permission on the parent. Read-write.
     * 
     */
    private final ResourceIdResponse parent;
    /**
     * @return The unique, user-assigned ID of the Project. It must be 6 to 30 lowercase letters, digits, or hyphens. It must start with a letter. Trailing hyphens are prohibited. Example: `tokyo-rain-123` Read-only after creation.
     * 
     */
    private final String projectId;
    /**
     * @return The number uniquely identifying the project. Example: `415104041262` Read-only.
     * 
     */
    private final String projectNumber;

    @CustomType.Constructor
    private GetProjectResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("lifecycleState") String lifecycleState,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parent") ResourceIdResponse parent,
        @CustomType.Parameter("projectId") String projectId,
        @CustomType.Parameter("projectNumber") String projectNumber) {
        this.createTime = createTime;
        this.labels = labels;
        this.lifecycleState = lifecycleState;
        this.name = name;
        this.parent = parent;
        this.projectId = projectId;
        this.projectNumber = projectNumber;
    }

    /**
     * @return Creation time. Read-only.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The labels associated with this Project. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: a-z{0,62}. Label values must be between 0 and 63 characters long and must conform to the regular expression [a-z0-9_-]{0,63}. A label value can be empty. No more than 256 labels can be associated with a given resource. Clients should store labels in a representation such as JSON that does not depend on specific characters being disallowed. Example: `&#34;environment&#34; : &#34;dev&#34;` Read-write.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The Project lifecycle state. Read-only.
     * 
     */
    public String lifecycleState() {
        return this.lifecycleState;
    }
    /**
     * @return The optional user-assigned display name of the Project. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, single-quote, double-quote, space, and exclamation point. Example: `My Project` Read-write.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return An optional reference to a parent Resource. Supported parent types include &#34;organization&#34; and &#34;folder&#34;. Once set, the parent cannot be cleared. The `parent` can be set on creation or using the `UpdateProject` method; the end user must have the `resourcemanager.projects.create` permission on the parent. Read-write.
     * 
     */
    public ResourceIdResponse parent() {
        return this.parent;
    }
    /**
     * @return The unique, user-assigned ID of the Project. It must be 6 to 30 lowercase letters, digits, or hyphens. It must start with a letter. Trailing hyphens are prohibited. Example: `tokyo-rain-123` Read-only after creation.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return The number uniquely identifying the project. Example: `415104041262` Read-only.
     * 
     */
    public String projectNumber() {
        return this.projectNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private Map<String,String> labels;
        private String lifecycleState;
        private String name;
        private ResourceIdResponse parent;
        private String projectId;
        private String projectNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.labels = defaults.labels;
    	      this.lifecycleState = defaults.lifecycleState;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.projectId = defaults.projectId;
    	      this.projectNumber = defaults.projectNumber;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder lifecycleState(String lifecycleState) {
            this.lifecycleState = Objects.requireNonNull(lifecycleState);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parent(ResourceIdResponse parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public Builder projectNumber(String projectNumber) {
            this.projectNumber = Objects.requireNonNull(projectNumber);
            return this;
        }        public GetProjectResult build() {
            return new GetProjectResult(createTime, labels, lifecycleState, name, parent, projectId, projectNumber);
        }
    }
}
