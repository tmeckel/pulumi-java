// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListWebAppHybridConnectionKeysResult {
    /**
     * @return Resource Id.
     * 
     */
    private final String id;
    /**
     * @return Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * @return Resource Name.
     * 
     */
    private final String name;
    /**
     * @return The name of the send key.
     * 
     */
    private final String sendKeyName;
    /**
     * @return The value of the send key.
     * 
     */
    private final String sendKeyValue;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ListWebAppHybridConnectionKeysResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("sendKeyName") String sendKeyName,
        @CustomType.Parameter("sendKeyValue") String sendKeyValue,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.sendKeyName = sendKeyName;
        this.sendKeyValue = sendKeyValue;
        this.type = type;
    }

    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The name of the send key.
     * 
     */
    public String sendKeyName() {
        return this.sendKeyName;
    }
    /**
     * @return The value of the send key.
     * 
     */
    public String sendKeyValue() {
        return this.sendKeyValue;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppHybridConnectionKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String kind;
        private String name;
        private String sendKeyName;
        private String sendKeyValue;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebAppHybridConnectionKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.sendKeyName = defaults.sendKeyName;
    	      this.sendKeyValue = defaults.sendKeyValue;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sendKeyName(String sendKeyName) {
            this.sendKeyName = Objects.requireNonNull(sendKeyName);
            return this;
        }
        public Builder sendKeyValue(String sendKeyValue) {
            this.sendKeyValue = Objects.requireNonNull(sendKeyValue);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ListWebAppHybridConnectionKeysResult build() {
            return new ListWebAppHybridConnectionKeysResult(id, kind, name, sendKeyName, sendKeyValue, type);
        }
    }
}
