// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetGroupResult {
    /**
     * The create time timestamp.
     * 
     */
    private final String createTime;
    /**
     * User-provided description of the group.
     * 
     */
    private final String description;
    /**
     * Display name is a user defined name for this group which can be updated.
     * 
     */
    private final String displayName;
    /**
     * The Group name.
     * 
     */
    private final String name;
    /**
     * The update time timestamp.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","description","displayName","name","updateTime"})
    private GetGroupResult(
        String createTime,
        String description,
        String displayName,
        String name,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.name = Objects.requireNonNull(name);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * The create time timestamp.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * User-provided description of the group.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Display name is a user defined name for this group which can be updated.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The Group name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The update time timestamp.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String displayName;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GetGroupResult build() {
            return new GetGroupResult(createTime, description, displayName, name, updateTime);
        }
    }
}
