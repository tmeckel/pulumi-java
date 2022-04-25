// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppCustomRule {
    /**
     * @return The condition for a URL rewrite or redirect rule, such as a country code.
     * 
     */
    private final @Nullable String condition;
    /**
     * @return The source pattern for a URL rewrite or redirect rule.
     * 
     */
    private final String source;
    /**
     * @return The status code for a URL rewrite or redirect rule. Valid values: `200`, `301`, `302`, `404`, `404-200`.
     * 
     */
    private final @Nullable String status;
    /**
     * @return The target pattern for a URL rewrite or redirect rule.
     * 
     */
    private final String target;

    @CustomType.Constructor
    private AppCustomRule(
        @CustomType.Parameter("condition") @Nullable String condition,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("target") String target) {
        this.condition = condition;
        this.source = source;
        this.status = status;
        this.target = target;
    }

    /**
     * @return The condition for a URL rewrite or redirect rule, such as a country code.
     * 
     */
    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * @return The source pattern for a URL rewrite or redirect rule.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return The status code for a URL rewrite or redirect rule. Valid values: `200`, `301`, `302`, `404`, `404-200`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The target pattern for a URL rewrite or redirect rule.
     * 
     */
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppCustomRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condition;
        private String source;
        private @Nullable String status;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(AppCustomRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.source = defaults.source;
    	      this.status = defaults.status;
    	      this.target = defaults.target;
        }

        public Builder condition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }        public AppCustomRule build() {
            return new AppCustomRule(condition, source, status, target);
        }
    }
}
