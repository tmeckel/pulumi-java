// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An entry for an Access Control list.
 * 
 */
public final class AclEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final AclEntryArgs Empty = new AclEntryArgs();

    /**
     * The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @InputImport(name="expirationTime")
      private final @Nullable Input<String> expirationTime;

    public Input<String> getExpirationTime() {
        return this.expirationTime == null ? Input.empty() : this.expirationTime;
    }

    /**
     * This is always `sql#aclEntry`.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Optional. A label to identify this entry.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The allowlisted value for the access control list.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public AclEntryArgs(
        @Nullable Input<String> expirationTime,
        @Nullable Input<String> kind,
        @Nullable Input<String> name,
        @Nullable Input<String> value) {
        this.expirationTime = expirationTime;
        this.kind = kind;
        this.name = name;
        this.value = value;
    }

    private AclEntryArgs() {
        this.expirationTime = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> expirationTime;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> name;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(AclEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder expirationTime(@Nullable Input<String> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder expirationTime(@Nullable String expirationTime) {
            this.expirationTime = Input.ofNullable(expirationTime);
            return this;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder value(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public AclEntryArgs build() {
            return new AclEntryArgs(expirationTime, kind, name, value);
        }
    }
}
