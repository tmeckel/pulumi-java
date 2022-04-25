// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Data provided with a pipeline or transform to provide descriptive info.
 * 
 */
public final class DisplayDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final DisplayDataArgs Empty = new DisplayDataArgs();

    /**
     * Contains value if the data is of a boolean type.
     * 
     */
    @Import(name="boolValue")
    private @Nullable Output<Boolean> boolValue;

    /**
     * @return Contains value if the data is of a boolean type.
     * 
     */
    public Optional<Output<Boolean>> boolValue() {
        return Optional.ofNullable(this.boolValue);
    }

    /**
     * Contains value if the data is of duration type.
     * 
     */
    @Import(name="durationValue")
    private @Nullable Output<String> durationValue;

    /**
     * @return Contains value if the data is of duration type.
     * 
     */
    public Optional<Output<String>> durationValue() {
        return Optional.ofNullable(this.durationValue);
    }

    /**
     * Contains value if the data is of float type.
     * 
     */
    @Import(name="floatValue")
    private @Nullable Output<Double> floatValue;

    /**
     * @return Contains value if the data is of float type.
     * 
     */
    public Optional<Output<Double>> floatValue() {
        return Optional.ofNullable(this.floatValue);
    }

    /**
     * Contains value if the data is of int64 type.
     * 
     */
    @Import(name="int64Value")
    private @Nullable Output<String> int64Value;

    /**
     * @return Contains value if the data is of int64 type.
     * 
     */
    public Optional<Output<String>> int64Value() {
        return Optional.ofNullable(this.int64Value);
    }

    /**
     * Contains value if the data is of java class type.
     * 
     */
    @Import(name="javaClassValue")
    private @Nullable Output<String> javaClassValue;

    /**
     * @return Contains value if the data is of java class type.
     * 
     */
    public Optional<Output<String>> javaClassValue() {
        return Optional.ofNullable(this.javaClassValue);
    }

    /**
     * The key identifying the display data. This is intended to be used as a label for the display data when viewed in a dax monitoring system.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The key identifying the display data. This is intended to be used as a label for the display data when viewed in a dax monitoring system.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * An optional label to display in a dax UI for the element.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return An optional label to display in a dax UI for the element.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The namespace for the key. This is usually a class name or programming language namespace (i.e. python module) which defines the display data. This allows a dax monitoring system to specially handle the data and perform custom rendering.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The namespace for the key. This is usually a class name or programming language namespace (i.e. python module) which defines the display data. This allows a dax monitoring system to specially handle the data and perform custom rendering.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * A possible additional shorter value to display. For example a java_class_name_value of com.mypackage.MyDoFn will be stored with MyDoFn as the short_str_value and com.mypackage.MyDoFn as the java_class_name value. short_str_value can be displayed and java_class_name_value will be displayed as a tooltip.
     * 
     */
    @Import(name="shortStrValue")
    private @Nullable Output<String> shortStrValue;

    /**
     * @return A possible additional shorter value to display. For example a java_class_name_value of com.mypackage.MyDoFn will be stored with MyDoFn as the short_str_value and com.mypackage.MyDoFn as the java_class_name value. short_str_value can be displayed and java_class_name_value will be displayed as a tooltip.
     * 
     */
    public Optional<Output<String>> shortStrValue() {
        return Optional.ofNullable(this.shortStrValue);
    }

    /**
     * Contains value if the data is of string type.
     * 
     */
    @Import(name="strValue")
    private @Nullable Output<String> strValue;

    /**
     * @return Contains value if the data is of string type.
     * 
     */
    public Optional<Output<String>> strValue() {
        return Optional.ofNullable(this.strValue);
    }

    /**
     * Contains value if the data is of timestamp type.
     * 
     */
    @Import(name="timestampValue")
    private @Nullable Output<String> timestampValue;

    /**
     * @return Contains value if the data is of timestamp type.
     * 
     */
    public Optional<Output<String>> timestampValue() {
        return Optional.ofNullable(this.timestampValue);
    }

    /**
     * An optional full URL.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return An optional full URL.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private DisplayDataArgs() {}

    private DisplayDataArgs(DisplayDataArgs $) {
        this.boolValue = $.boolValue;
        this.durationValue = $.durationValue;
        this.floatValue = $.floatValue;
        this.int64Value = $.int64Value;
        this.javaClassValue = $.javaClassValue;
        this.key = $.key;
        this.label = $.label;
        this.namespace = $.namespace;
        this.shortStrValue = $.shortStrValue;
        this.strValue = $.strValue;
        this.timestampValue = $.timestampValue;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DisplayDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DisplayDataArgs $;

        public Builder() {
            $ = new DisplayDataArgs();
        }

        public Builder(DisplayDataArgs defaults) {
            $ = new DisplayDataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param boolValue Contains value if the data is of a boolean type.
         * 
         * @return builder
         * 
         */
        public Builder boolValue(@Nullable Output<Boolean> boolValue) {
            $.boolValue = boolValue;
            return this;
        }

        /**
         * @param boolValue Contains value if the data is of a boolean type.
         * 
         * @return builder
         * 
         */
        public Builder boolValue(Boolean boolValue) {
            return boolValue(Output.of(boolValue));
        }

        /**
         * @param durationValue Contains value if the data is of duration type.
         * 
         * @return builder
         * 
         */
        public Builder durationValue(@Nullable Output<String> durationValue) {
            $.durationValue = durationValue;
            return this;
        }

        /**
         * @param durationValue Contains value if the data is of duration type.
         * 
         * @return builder
         * 
         */
        public Builder durationValue(String durationValue) {
            return durationValue(Output.of(durationValue));
        }

        /**
         * @param floatValue Contains value if the data is of float type.
         * 
         * @return builder
         * 
         */
        public Builder floatValue(@Nullable Output<Double> floatValue) {
            $.floatValue = floatValue;
            return this;
        }

        /**
         * @param floatValue Contains value if the data is of float type.
         * 
         * @return builder
         * 
         */
        public Builder floatValue(Double floatValue) {
            return floatValue(Output.of(floatValue));
        }

        /**
         * @param int64Value Contains value if the data is of int64 type.
         * 
         * @return builder
         * 
         */
        public Builder int64Value(@Nullable Output<String> int64Value) {
            $.int64Value = int64Value;
            return this;
        }

        /**
         * @param int64Value Contains value if the data is of int64 type.
         * 
         * @return builder
         * 
         */
        public Builder int64Value(String int64Value) {
            return int64Value(Output.of(int64Value));
        }

        /**
         * @param javaClassValue Contains value if the data is of java class type.
         * 
         * @return builder
         * 
         */
        public Builder javaClassValue(@Nullable Output<String> javaClassValue) {
            $.javaClassValue = javaClassValue;
            return this;
        }

        /**
         * @param javaClassValue Contains value if the data is of java class type.
         * 
         * @return builder
         * 
         */
        public Builder javaClassValue(String javaClassValue) {
            return javaClassValue(Output.of(javaClassValue));
        }

        /**
         * @param key The key identifying the display data. This is intended to be used as a label for the display data when viewed in a dax monitoring system.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key identifying the display data. This is intended to be used as a label for the display data when viewed in a dax monitoring system.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param label An optional label to display in a dax UI for the element.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label An optional label to display in a dax UI for the element.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param namespace The namespace for the key. This is usually a class name or programming language namespace (i.e. python module) which defines the display data. This allows a dax monitoring system to specially handle the data and perform custom rendering.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace for the key. This is usually a class name or programming language namespace (i.e. python module) which defines the display data. This allows a dax monitoring system to specially handle the data and perform custom rendering.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param shortStrValue A possible additional shorter value to display. For example a java_class_name_value of com.mypackage.MyDoFn will be stored with MyDoFn as the short_str_value and com.mypackage.MyDoFn as the java_class_name value. short_str_value can be displayed and java_class_name_value will be displayed as a tooltip.
         * 
         * @return builder
         * 
         */
        public Builder shortStrValue(@Nullable Output<String> shortStrValue) {
            $.shortStrValue = shortStrValue;
            return this;
        }

        /**
         * @param shortStrValue A possible additional shorter value to display. For example a java_class_name_value of com.mypackage.MyDoFn will be stored with MyDoFn as the short_str_value and com.mypackage.MyDoFn as the java_class_name value. short_str_value can be displayed and java_class_name_value will be displayed as a tooltip.
         * 
         * @return builder
         * 
         */
        public Builder shortStrValue(String shortStrValue) {
            return shortStrValue(Output.of(shortStrValue));
        }

        /**
         * @param strValue Contains value if the data is of string type.
         * 
         * @return builder
         * 
         */
        public Builder strValue(@Nullable Output<String> strValue) {
            $.strValue = strValue;
            return this;
        }

        /**
         * @param strValue Contains value if the data is of string type.
         * 
         * @return builder
         * 
         */
        public Builder strValue(String strValue) {
            return strValue(Output.of(strValue));
        }

        /**
         * @param timestampValue Contains value if the data is of timestamp type.
         * 
         * @return builder
         * 
         */
        public Builder timestampValue(@Nullable Output<String> timestampValue) {
            $.timestampValue = timestampValue;
            return this;
        }

        /**
         * @param timestampValue Contains value if the data is of timestamp type.
         * 
         * @return builder
         * 
         */
        public Builder timestampValue(String timestampValue) {
            return timestampValue(Output.of(timestampValue));
        }

        /**
         * @param url An optional full URL.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url An optional full URL.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public DisplayDataArgs build() {
            return $;
        }
    }

}
