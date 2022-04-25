// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.runtimeconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVariableResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String parent;
    private final @Nullable String project;
    private final String text;
    private final String updateTime;
    private final String value;

    @CustomType.Constructor
    private GetVariableResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parent") String parent,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("text") String text,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("value") String value) {
        this.id = id;
        this.name = name;
        this.parent = parent;
        this.project = project;
        this.text = text;
        this.updateTime = updateTime;
        this.value = value;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String parent() {
        return this.parent;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public String text() {
        return this.text;
    }
    public String updateTime() {
        return this.updateTime;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVariableResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String parent;
        private @Nullable String project;
        private String text;
        private String updateTime;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVariableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.project = defaults.project;
    	      this.text = defaults.text;
    	      this.updateTime = defaults.updateTime;
    	      this.value = defaults.value;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetVariableResult build() {
            return new GetVariableResult(id, name, parent, project, text, updateTime, value);
        }
    }
}
