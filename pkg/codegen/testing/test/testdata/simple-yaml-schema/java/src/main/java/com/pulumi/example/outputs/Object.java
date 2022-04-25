// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.example.Resource;
import com.pulumi.example.outputs.ConfigMap;
import com.pulumi.example.outputs.SomeOtherObject;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Object {
    private final @Nullable String bar;
    private final @Nullable List<ConfigMap> configs;
    private final @Nullable Resource foo;
    /**
     * @return List of lists of other objects
     * 
     */
    private final @Nullable List<List<SomeOtherObject>> others;
    /**
     * @return Mapping from string to list of some other object
     * 
     */
    private final @Nullable Map<String,List<SomeOtherObject>> stillOthers;

    @CustomType.Constructor
    private Object(
        @CustomType.Parameter("bar") @Nullable String bar,
        @CustomType.Parameter("configs") @Nullable List<ConfigMap> configs,
        @CustomType.Parameter("foo") @Nullable Resource foo,
        @CustomType.Parameter("others") @Nullable List<List<SomeOtherObject>> others,
        @CustomType.Parameter("stillOthers") @Nullable Map<String,List<SomeOtherObject>> stillOthers) {
        this.bar = bar;
        this.configs = configs;
        this.foo = foo;
        this.others = others;
        this.stillOthers = stillOthers;
    }

    public Optional<String> bar() {
        return Optional.ofNullable(this.bar);
    }
    public List<ConfigMap> configs() {
        return this.configs == null ? List.of() : this.configs;
    }
    public Optional<Resource> foo() {
        return Optional.ofNullable(this.foo);
    }
    /**
     * @return List of lists of other objects
     * 
     */
    public List<List<SomeOtherObject>> others() {
        return this.others == null ? List.of() : this.others;
    }
    /**
     * @return Mapping from string to list of some other object
     * 
     */
    public Map<String,List<SomeOtherObject>> stillOthers() {
        return this.stillOthers == null ? Map.of() : this.stillOthers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Object defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bar;
        private @Nullable List<ConfigMap> configs;
        private @Nullable Resource foo;
        private @Nullable List<List<SomeOtherObject>> others;
        private @Nullable Map<String,List<SomeOtherObject>> stillOthers;

        public Builder() {
    	      // Empty
        }

        public Builder(Object defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bar = defaults.bar;
    	      this.configs = defaults.configs;
    	      this.foo = defaults.foo;
    	      this.others = defaults.others;
    	      this.stillOthers = defaults.stillOthers;
        }

        public Builder bar(@Nullable String bar) {
            this.bar = bar;
            return this;
        }
        public Builder configs(@Nullable List<ConfigMap> configs) {
            this.configs = configs;
            return this;
        }
        public Builder configs(ConfigMap... configs) {
            return configs(List.of(configs));
        }
        public Builder foo(@Nullable Resource foo) {
            this.foo = foo;
            return this;
        }
        public Builder others(@Nullable List<List<SomeOtherObject>> others) {
            this.others = others;
            return this;
        }
        public Builder stillOthers(@Nullable Map<String,List<SomeOtherObject>> stillOthers) {
            this.stillOthers = stillOthers;
            return this;
        }        public Object build() {
            return new Object(bar, configs, foo, others, stillOthers);
        }
    }
}
