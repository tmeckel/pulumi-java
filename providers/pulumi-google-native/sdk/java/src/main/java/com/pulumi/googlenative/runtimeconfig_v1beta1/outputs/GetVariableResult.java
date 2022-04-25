// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.runtimeconfig_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVariableResult {
    /**
     * @return The name of the variable resource, in the format: projects/[PROJECT_ID]/configs/[CONFIG_NAME]/variables/[VARIABLE_NAME] The `[PROJECT_ID]` must be a valid project ID, `[CONFIG_NAME]` must be a valid RuntimeConfig resource and `[VARIABLE_NAME]` follows Unix file system file path naming. The `[VARIABLE_NAME]` can contain ASCII letters, numbers, slashes and dashes. Slashes are used as path element separators and are not part of the `[VARIABLE_NAME]` itself, so `[VARIABLE_NAME]` must contain at least one non-slash character. Multiple slashes are coalesced into single slash character. Each path segment should match [0-9A-Za-z](?:[_.A-Za-z0-9-]{0,62}[_.A-Za-z0-9])? regular expression. The length of a `[VARIABLE_NAME]` must be less than 256 characters. Once you create a variable, you cannot change the variable name.
     * 
     */
    private final String name;
    /**
     * @return The current state of the variable. The variable state indicates the outcome of the `variables().watch` call and is visible through the `get` and `list` calls.
     * 
     */
    private final String state;
    /**
     * @return The string value of the variable. The length of the value must be less than 4096 bytes. Empty values are also accepted. For example, `text: &#34;my text value&#34;`. The string must be valid UTF-8.
     * 
     */
    private final String text;
    /**
     * @return The time of the last variable update. Timestamp will be UTC timestamp.
     * 
     */
    private final String updateTime;
    /**
     * @return The binary value of the variable. The length of the value must be less than 4096 bytes. Empty values are also accepted. The value must be base64 encoded, and must comply with IETF RFC4648 (https://www.ietf.org/rfc/rfc4648.txt). Only one of `value` or `text` can be set.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GetVariableResult(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("text") String text,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.state = state;
        this.text = text;
        this.updateTime = updateTime;
        this.value = value;
    }

    /**
     * @return The name of the variable resource, in the format: projects/[PROJECT_ID]/configs/[CONFIG_NAME]/variables/[VARIABLE_NAME] The `[PROJECT_ID]` must be a valid project ID, `[CONFIG_NAME]` must be a valid RuntimeConfig resource and `[VARIABLE_NAME]` follows Unix file system file path naming. The `[VARIABLE_NAME]` can contain ASCII letters, numbers, slashes and dashes. Slashes are used as path element separators and are not part of the `[VARIABLE_NAME]` itself, so `[VARIABLE_NAME]` must contain at least one non-slash character. Multiple slashes are coalesced into single slash character. Each path segment should match [0-9A-Za-z](?:[_.A-Za-z0-9-]{0,62}[_.A-Za-z0-9])? regular expression. The length of a `[VARIABLE_NAME]` must be less than 256 characters. Once you create a variable, you cannot change the variable name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current state of the variable. The variable state indicates the outcome of the `variables().watch` call and is visible through the `get` and `list` calls.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The string value of the variable. The length of the value must be less than 4096 bytes. Empty values are also accepted. For example, `text: &#34;my text value&#34;`. The string must be valid UTF-8.
     * 
     */
    public String text() {
        return this.text;
    }
    /**
     * @return The time of the last variable update. Timestamp will be UTC timestamp.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return The binary value of the variable. The length of the value must be less than 4096 bytes. Empty values are also accepted. The value must be base64 encoded, and must comply with IETF RFC4648 (https://www.ietf.org/rfc/rfc4648.txt). Only one of `value` or `text` can be set.
     * 
     */
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
        private String name;
        private String state;
        private String text;
        private String updateTime;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVariableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.text = defaults.text;
    	      this.updateTime = defaults.updateTime;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
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
            return new GetVariableResult(name, state, text, updateTime, value);
        }
    }
}
