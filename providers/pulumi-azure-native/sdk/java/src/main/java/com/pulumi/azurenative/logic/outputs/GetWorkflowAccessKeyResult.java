// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkflowAccessKeyResult {
    /**
     * @return Gets or sets the resource id.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Gets the workflow access key name.
     * 
     */
    private final String name;
    /**
     * @return Gets or sets the not-after time.
     * 
     */
    private final @Nullable String notAfter;
    /**
     * @return Gets or sets the not-before time.
     * 
     */
    private final @Nullable String notBefore;
    /**
     * @return Gets the workflow access key type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWorkflowAccessKeyResult(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notAfter") @Nullable String notAfter,
        @CustomType.Parameter("notBefore") @Nullable String notBefore,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.notAfter = notAfter;
        this.notBefore = notBefore;
        this.type = type;
    }

    /**
     * @return Gets or sets the resource id.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Gets the workflow access key name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Gets or sets the not-after time.
     * 
     */
    public Optional<String> notAfter() {
        return Optional.ofNullable(this.notAfter);
    }
    /**
     * @return Gets or sets the not-before time.
     * 
     */
    public Optional<String> notBefore() {
        return Optional.ofNullable(this.notBefore);
    }
    /**
     * @return Gets the workflow access key type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkflowAccessKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private String name;
        private @Nullable String notAfter;
        private @Nullable String notBefore;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkflowAccessKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.notAfter = defaults.notAfter;
    	      this.notBefore = defaults.notBefore;
    	      this.type = defaults.type;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notAfter(@Nullable String notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public Builder notBefore(@Nullable String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWorkflowAccessKeyResult build() {
            return new GetWorkflowAccessKeyResult(id, name, notAfter, notBefore, type);
        }
    }
}
