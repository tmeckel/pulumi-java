// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs;

import com.google.gson.JsonElement;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs.ExternalDocumentation;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs.ValidationRule;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JSONSchemaProps {
    private final @Nullable String $ref;
    private final @Nullable String $schema;
    private final @Nullable Either<JSONSchemaProps,Boolean> additionalItems;
    private final @Nullable Either<JSONSchemaProps,Boolean> additionalProperties;
    private final @Nullable List<JSONSchemaProps> allOf;
    private final @Nullable List<JSONSchemaProps> anyOf;
    /**
     * default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.
     * 
     */
    private final @Nullable JsonElement $default;
    private final @Nullable Map<String,JSONSchemaProps> definitions;
    private final @Nullable Map<String,Either<JSONSchemaProps,List<String>>> dependencies;
    private final @Nullable String description;
    private final @Nullable List<JsonElement> $enum;
    private final @Nullable JsonElement example;
    private final @Nullable Boolean exclusiveMaximum;
    private final @Nullable Boolean exclusiveMinimum;
    private final @Nullable ExternalDocumentation externalDocs;
    /**
     * format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:
     * 
     * - bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like "0321751043" or "978-0321751041" - isbn10: an ISBN10 number string like "0321751043" - isbn13: an ISBN13 number string like "978-0321751041" - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\d{3})\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\d{3}[- ]?\d{2}[- ]?\d{4}$ - hexcolor: an hexadecimal color code like "#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like "rgb(255,255,2559" - byte: base64 encoded binary data - password: any kind of string - date: a date string like "2006-01-02" as defined by full-date in RFC3339 - duration: a duration string like "22 ns" as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like "2014-12-15T19:30:20.000Z" as defined by date-time in RFC3339.
     * 
     */
    private final @Nullable String format;
    private final @Nullable String id;
    private final @Nullable Either<JSONSchemaProps,List<JsonElement>> items;
    private final @Nullable Integer maxItems;
    private final @Nullable Integer maxLength;
    private final @Nullable Integer maxProperties;
    private final @Nullable Double maximum;
    private final @Nullable Integer minItems;
    private final @Nullable Integer minLength;
    private final @Nullable Integer minProperties;
    private final @Nullable Double minimum;
    private final @Nullable Double multipleOf;
    private final @Nullable JSONSchemaProps not;
    private final @Nullable Boolean nullable;
    private final @Nullable List<JSONSchemaProps> oneOf;
    private final @Nullable String pattern;
    private final @Nullable Map<String,JSONSchemaProps> patternProperties;
    private final @Nullable Map<String,JSONSchemaProps> properties;
    private final @Nullable List<String> required;
    private final @Nullable String title;
    private final @Nullable String type;
    private final @Nullable Boolean uniqueItems;
    /**
     * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).
     * 
     */
    private final @Nullable Boolean x_kubernetes_embedded_resource;
    /**
     * x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:
     * 
     * 1) anyOf:
     *    - type: integer
     *    - type: string
     * 2) allOf:
     *    - anyOf:
     *      - type: integer
     *      - type: string
     *    - ... zero or more
     * 
     */
    private final @Nullable Boolean x_kubernetes_int_or_string;
    /**
     * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by specifying the keys used as the index of the map.
     * 
     * This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to "map". Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).
     * 
     * The properties specified must either be required or have a default value, to ensure those properties are present for all list items.
     * 
     */
    private final @Nullable List<String> x_kubernetes_list_map_keys;
    /**
     * x-kubernetes-list-type annotates an array to further describe its topology. This extension must only be used on lists and may have 3 possible values:
     * 
     * 1) `atomic`: the list is treated as a single entity, like a scalar.
     *      Atomic lists will be entirely replaced when updated. This extension
     *      may be used on any type of list (struct, scalar, ...).
     * 2) `set`:
     *      Sets are lists that must not have multiple items with the same value. Each
     *      value must be a scalar, an object with x-kubernetes-map-type `atomic` or an
     *      array with x-kubernetes-list-type `atomic`.
     * 3) `map`:
     *      These lists are like maps in that their elements have a non-index key
     *      used to identify them. Order is preserved upon merge. The map tag
     *      must only be used on a list with elements of type object.
     *    Defaults to atomic for arrays.
     * 
     */
    private final @Nullable String x_kubernetes_list_type;
    /**
     * x-kubernetes-map-type annotates an object to further describe its topology. This extension must only be used when type is object and may have 2 possible values:
     * 
     * 1) `granular`:
     *      These maps are actual maps (key-value pairs) and each fields are independent
     *      from each other (they can each be manipulated by separate actors). This is
     *      the default behaviour for all maps.
     * 2) `atomic`: the list is treated as a single entity, like a scalar.
     *      Atomic maps will be entirely replaced when updated.
     * 
     */
    private final @Nullable String x_kubernetes_map_type;
    /**
     * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.
     * 
     */
    private final @Nullable Boolean x_kubernetes_preserve_unknown_fields;
    /**
     * x-kubernetes-validations describes a list of validation rules written in the CEL expression language. This field is an alpha-level. Using this field requires the feature gate `CustomResourceValidationExpressions` to be enabled.
     * 
     */
    private final @Nullable List<ValidationRule> x_kubernetes_validations;

    @OutputCustomType.Constructor
    private JSONSchemaProps(
        @OutputCustomType.Parameter("$ref") @Nullable String $ref,
        @OutputCustomType.Parameter("$schema") @Nullable String $schema,
        @OutputCustomType.Parameter("additionalItems") @Nullable Either<JSONSchemaProps,Boolean> additionalItems,
        @OutputCustomType.Parameter("additionalProperties") @Nullable Either<JSONSchemaProps,Boolean> additionalProperties,
        @OutputCustomType.Parameter("allOf") @Nullable List<JSONSchemaProps> allOf,
        @OutputCustomType.Parameter("anyOf") @Nullable List<JSONSchemaProps> anyOf,
        @OutputCustomType.Parameter("default") @Nullable JsonElement $default,
        @OutputCustomType.Parameter("definitions") @Nullable Map<String,JSONSchemaProps> definitions,
        @OutputCustomType.Parameter("dependencies") @Nullable Map<String,Either<JSONSchemaProps,List<String>>> dependencies,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("enum") @Nullable List<JsonElement> $enum,
        @OutputCustomType.Parameter("example") @Nullable JsonElement example,
        @OutputCustomType.Parameter("exclusiveMaximum") @Nullable Boolean exclusiveMaximum,
        @OutputCustomType.Parameter("exclusiveMinimum") @Nullable Boolean exclusiveMinimum,
        @OutputCustomType.Parameter("externalDocs") @Nullable ExternalDocumentation externalDocs,
        @OutputCustomType.Parameter("format") @Nullable String format,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("items") @Nullable Either<JSONSchemaProps,List<JsonElement>> items,
        @OutputCustomType.Parameter("maxItems") @Nullable Integer maxItems,
        @OutputCustomType.Parameter("maxLength") @Nullable Integer maxLength,
        @OutputCustomType.Parameter("maxProperties") @Nullable Integer maxProperties,
        @OutputCustomType.Parameter("maximum") @Nullable Double maximum,
        @OutputCustomType.Parameter("minItems") @Nullable Integer minItems,
        @OutputCustomType.Parameter("minLength") @Nullable Integer minLength,
        @OutputCustomType.Parameter("minProperties") @Nullable Integer minProperties,
        @OutputCustomType.Parameter("minimum") @Nullable Double minimum,
        @OutputCustomType.Parameter("multipleOf") @Nullable Double multipleOf,
        @OutputCustomType.Parameter("not") @Nullable JSONSchemaProps not,
        @OutputCustomType.Parameter("nullable") @Nullable Boolean nullable,
        @OutputCustomType.Parameter("oneOf") @Nullable List<JSONSchemaProps> oneOf,
        @OutputCustomType.Parameter("pattern") @Nullable String pattern,
        @OutputCustomType.Parameter("patternProperties") @Nullable Map<String,JSONSchemaProps> patternProperties,
        @OutputCustomType.Parameter("properties") @Nullable Map<String,JSONSchemaProps> properties,
        @OutputCustomType.Parameter("required") @Nullable List<String> required,
        @OutputCustomType.Parameter("title") @Nullable String title,
        @OutputCustomType.Parameter("type") @Nullable String type,
        @OutputCustomType.Parameter("uniqueItems") @Nullable Boolean uniqueItems,
        @OutputCustomType.Parameter("x_kubernetes_embedded_resource") @Nullable Boolean x_kubernetes_embedded_resource,
        @OutputCustomType.Parameter("x_kubernetes_int_or_string") @Nullable Boolean x_kubernetes_int_or_string,
        @OutputCustomType.Parameter("x_kubernetes_list_map_keys") @Nullable List<String> x_kubernetes_list_map_keys,
        @OutputCustomType.Parameter("x_kubernetes_list_type") @Nullable String x_kubernetes_list_type,
        @OutputCustomType.Parameter("x_kubernetes_map_type") @Nullable String x_kubernetes_map_type,
        @OutputCustomType.Parameter("x_kubernetes_preserve_unknown_fields") @Nullable Boolean x_kubernetes_preserve_unknown_fields,
        @OutputCustomType.Parameter("x_kubernetes_validations") @Nullable List<ValidationRule> x_kubernetes_validations) {
        this.$ref = $ref;
        this.$schema = $schema;
        this.additionalItems = additionalItems;
        this.additionalProperties = additionalProperties;
        this.allOf = allOf;
        this.anyOf = anyOf;
        this.$default = $default;
        this.definitions = definitions;
        this.dependencies = dependencies;
        this.description = description;
        this.$enum = $enum;
        this.example = example;
        this.exclusiveMaximum = exclusiveMaximum;
        this.exclusiveMinimum = exclusiveMinimum;
        this.externalDocs = externalDocs;
        this.format = format;
        this.id = id;
        this.items = items;
        this.maxItems = maxItems;
        this.maxLength = maxLength;
        this.maxProperties = maxProperties;
        this.maximum = maximum;
        this.minItems = minItems;
        this.minLength = minLength;
        this.minProperties = minProperties;
        this.minimum = minimum;
        this.multipleOf = multipleOf;
        this.not = not;
        this.nullable = nullable;
        this.oneOf = oneOf;
        this.pattern = pattern;
        this.patternProperties = patternProperties;
        this.properties = properties;
        this.required = required;
        this.title = title;
        this.type = type;
        this.uniqueItems = uniqueItems;
        this.x_kubernetes_embedded_resource = x_kubernetes_embedded_resource;
        this.x_kubernetes_int_or_string = x_kubernetes_int_or_string;
        this.x_kubernetes_list_map_keys = x_kubernetes_list_map_keys;
        this.x_kubernetes_list_type = x_kubernetes_list_type;
        this.x_kubernetes_map_type = x_kubernetes_map_type;
        this.x_kubernetes_preserve_unknown_fields = x_kubernetes_preserve_unknown_fields;
        this.x_kubernetes_validations = x_kubernetes_validations;
    }

    public Optional<String> get$ref() {
        return Optional.ofNullable(this.$ref);
    }
    public Optional<String> get$schema() {
        return Optional.ofNullable(this.$schema);
    }
    public Optional<Either<JSONSchemaProps,Boolean>> getAdditionalItems() {
        return Optional.ofNullable(this.additionalItems);
    }
    public Optional<Either<JSONSchemaProps,Boolean>> getAdditionalProperties() {
        return Optional.ofNullable(this.additionalProperties);
    }
    public List<JSONSchemaProps> getAllOf() {
        return this.allOf == null ? List.of() : this.allOf;
    }
    public List<JSONSchemaProps> getAnyOf() {
        return this.anyOf == null ? List.of() : this.anyOf;
    }
    /**
     * default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.
     * 
    */
    public Optional<JsonElement> get$default() {
        return Optional.ofNullable(this.$default);
    }
    public Map<String,JSONSchemaProps> getDefinitions() {
        return this.definitions == null ? Map.of() : this.definitions;
    }
    public Map<String,Either<JSONSchemaProps,List<String>>> getDependencies() {
        return this.dependencies == null ? Map.of() : this.dependencies;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public List<JsonElement> get$enum() {
        return this.$enum == null ? List.of() : this.$enum;
    }
    public Optional<JsonElement> getExample() {
        return Optional.ofNullable(this.example);
    }
    public Optional<Boolean> getExclusiveMaximum() {
        return Optional.ofNullable(this.exclusiveMaximum);
    }
    public Optional<Boolean> getExclusiveMinimum() {
        return Optional.ofNullable(this.exclusiveMinimum);
    }
    public Optional<ExternalDocumentation> getExternalDocs() {
        return Optional.ofNullable(this.externalDocs);
    }
    /**
     * format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:
     * 
     * - bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like "0321751043" or "978-0321751041" - isbn10: an ISBN10 number string like "0321751043" - isbn13: an ISBN13 number string like "978-0321751041" - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\d{3})\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\d{3}[- ]?\d{2}[- ]?\d{4}$ - hexcolor: an hexadecimal color code like "#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like "rgb(255,255,2559" - byte: base64 encoded binary data - password: any kind of string - date: a date string like "2006-01-02" as defined by full-date in RFC3339 - duration: a duration string like "22 ns" as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like "2014-12-15T19:30:20.000Z" as defined by date-time in RFC3339.
     * 
    */
    public Optional<String> getFormat() {
        return Optional.ofNullable(this.format);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<Either<JSONSchemaProps,List<JsonElement>>> getItems() {
        return Optional.ofNullable(this.items);
    }
    public Optional<Integer> getMaxItems() {
        return Optional.ofNullable(this.maxItems);
    }
    public Optional<Integer> getMaxLength() {
        return Optional.ofNullable(this.maxLength);
    }
    public Optional<Integer> getMaxProperties() {
        return Optional.ofNullable(this.maxProperties);
    }
    public Optional<Double> getMaximum() {
        return Optional.ofNullable(this.maximum);
    }
    public Optional<Integer> getMinItems() {
        return Optional.ofNullable(this.minItems);
    }
    public Optional<Integer> getMinLength() {
        return Optional.ofNullable(this.minLength);
    }
    public Optional<Integer> getMinProperties() {
        return Optional.ofNullable(this.minProperties);
    }
    public Optional<Double> getMinimum() {
        return Optional.ofNullable(this.minimum);
    }
    public Optional<Double> getMultipleOf() {
        return Optional.ofNullable(this.multipleOf);
    }
    public Optional<JSONSchemaProps> getNot() {
        return Optional.ofNullable(this.not);
    }
    public Optional<Boolean> getNullable() {
        return Optional.ofNullable(this.nullable);
    }
    public List<JSONSchemaProps> getOneOf() {
        return this.oneOf == null ? List.of() : this.oneOf;
    }
    public Optional<String> getPattern() {
        return Optional.ofNullable(this.pattern);
    }
    public Map<String,JSONSchemaProps> getPatternProperties() {
        return this.patternProperties == null ? Map.of() : this.patternProperties;
    }
    public Map<String,JSONSchemaProps> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    public List<String> getRequired() {
        return this.required == null ? List.of() : this.required;
    }
    public Optional<String> getTitle() {
        return Optional.ofNullable(this.title);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    public Optional<Boolean> getUniqueItems() {
        return Optional.ofNullable(this.uniqueItems);
    }
    /**
     * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).
     * 
    */
    public Optional<Boolean> getX_kubernetes_embedded_resource() {
        return Optional.ofNullable(this.x_kubernetes_embedded_resource);
    }
    /**
     * x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:
     * 
     * 1) anyOf:
     *    - type: integer
     *    - type: string
     * 2) allOf:
     *    - anyOf:
     *      - type: integer
     *      - type: string
     *    - ... zero or more
     * 
    */
    public Optional<Boolean> getX_kubernetes_int_or_string() {
        return Optional.ofNullable(this.x_kubernetes_int_or_string);
    }
    /**
     * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by specifying the keys used as the index of the map.
     * 
     * This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to "map". Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).
     * 
     * The properties specified must either be required or have a default value, to ensure those properties are present for all list items.
     * 
    */
    public List<String> getX_kubernetes_list_map_keys() {
        return this.x_kubernetes_list_map_keys == null ? List.of() : this.x_kubernetes_list_map_keys;
    }
    /**
     * x-kubernetes-list-type annotates an array to further describe its topology. This extension must only be used on lists and may have 3 possible values:
     * 
     * 1) `atomic`: the list is treated as a single entity, like a scalar.
     *      Atomic lists will be entirely replaced when updated. This extension
     *      may be used on any type of list (struct, scalar, ...).
     * 2) `set`:
     *      Sets are lists that must not have multiple items with the same value. Each
     *      value must be a scalar, an object with x-kubernetes-map-type `atomic` or an
     *      array with x-kubernetes-list-type `atomic`.
     * 3) `map`:
     *      These lists are like maps in that their elements have a non-index key
     *      used to identify them. Order is preserved upon merge. The map tag
     *      must only be used on a list with elements of type object.
     *    Defaults to atomic for arrays.
     * 
    */
    public Optional<String> getX_kubernetes_list_type() {
        return Optional.ofNullable(this.x_kubernetes_list_type);
    }
    /**
     * x-kubernetes-map-type annotates an object to further describe its topology. This extension must only be used when type is object and may have 2 possible values:
     * 
     * 1) `granular`:
     *      These maps are actual maps (key-value pairs) and each fields are independent
     *      from each other (they can each be manipulated by separate actors). This is
     *      the default behaviour for all maps.
     * 2) `atomic`: the list is treated as a single entity, like a scalar.
     *      Atomic maps will be entirely replaced when updated.
     * 
    */
    public Optional<String> getX_kubernetes_map_type() {
        return Optional.ofNullable(this.x_kubernetes_map_type);
    }
    /**
     * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.
     * 
    */
    public Optional<Boolean> getX_kubernetes_preserve_unknown_fields() {
        return Optional.ofNullable(this.x_kubernetes_preserve_unknown_fields);
    }
    /**
     * x-kubernetes-validations describes a list of validation rules written in the CEL expression language. This field is an alpha-level. Using this field requires the feature gate `CustomResourceValidationExpressions` to be enabled.
     * 
    */
    public List<ValidationRule> getX_kubernetes_validations() {
        return this.x_kubernetes_validations == null ? List.of() : this.x_kubernetes_validations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JSONSchemaProps defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String $ref;
        private @Nullable String $schema;
        private @Nullable Either<JSONSchemaProps,Boolean> additionalItems;
        private @Nullable Either<JSONSchemaProps,Boolean> additionalProperties;
        private @Nullable List<JSONSchemaProps> allOf;
        private @Nullable List<JSONSchemaProps> anyOf;
        private @Nullable JsonElement $default;
        private @Nullable Map<String,JSONSchemaProps> definitions;
        private @Nullable Map<String,Either<JSONSchemaProps,List<String>>> dependencies;
        private @Nullable String description;
        private @Nullable List<JsonElement> $enum;
        private @Nullable JsonElement example;
        private @Nullable Boolean exclusiveMaximum;
        private @Nullable Boolean exclusiveMinimum;
        private @Nullable ExternalDocumentation externalDocs;
        private @Nullable String format;
        private @Nullable String id;
        private @Nullable Either<JSONSchemaProps,List<JsonElement>> items;
        private @Nullable Integer maxItems;
        private @Nullable Integer maxLength;
        private @Nullable Integer maxProperties;
        private @Nullable Double maximum;
        private @Nullable Integer minItems;
        private @Nullable Integer minLength;
        private @Nullable Integer minProperties;
        private @Nullable Double minimum;
        private @Nullable Double multipleOf;
        private @Nullable JSONSchemaProps not;
        private @Nullable Boolean nullable;
        private @Nullable List<JSONSchemaProps> oneOf;
        private @Nullable String pattern;
        private @Nullable Map<String,JSONSchemaProps> patternProperties;
        private @Nullable Map<String,JSONSchemaProps> properties;
        private @Nullable List<String> required;
        private @Nullable String title;
        private @Nullable String type;
        private @Nullable Boolean uniqueItems;
        private @Nullable Boolean x_kubernetes_embedded_resource;
        private @Nullable Boolean x_kubernetes_int_or_string;
        private @Nullable List<String> x_kubernetes_list_map_keys;
        private @Nullable String x_kubernetes_list_type;
        private @Nullable String x_kubernetes_map_type;
        private @Nullable Boolean x_kubernetes_preserve_unknown_fields;
        private @Nullable List<ValidationRule> x_kubernetes_validations;

        public Builder() {
    	      // Empty
        }

        public Builder(JSONSchemaProps defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$ref = defaults.$ref;
    	      this.$schema = defaults.$schema;
    	      this.additionalItems = defaults.additionalItems;
    	      this.additionalProperties = defaults.additionalProperties;
    	      this.allOf = defaults.allOf;
    	      this.anyOf = defaults.anyOf;
    	      this.$default = defaults.$default;
    	      this.definitions = defaults.definitions;
    	      this.dependencies = defaults.dependencies;
    	      this.description = defaults.description;
    	      this.$enum = defaults.$enum;
    	      this.example = defaults.example;
    	      this.exclusiveMaximum = defaults.exclusiveMaximum;
    	      this.exclusiveMinimum = defaults.exclusiveMinimum;
    	      this.externalDocs = defaults.externalDocs;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.maxItems = defaults.maxItems;
    	      this.maxLength = defaults.maxLength;
    	      this.maxProperties = defaults.maxProperties;
    	      this.maximum = defaults.maximum;
    	      this.minItems = defaults.minItems;
    	      this.minLength = defaults.minLength;
    	      this.minProperties = defaults.minProperties;
    	      this.minimum = defaults.minimum;
    	      this.multipleOf = defaults.multipleOf;
    	      this.not = defaults.not;
    	      this.nullable = defaults.nullable;
    	      this.oneOf = defaults.oneOf;
    	      this.pattern = defaults.pattern;
    	      this.patternProperties = defaults.patternProperties;
    	      this.properties = defaults.properties;
    	      this.required = defaults.required;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
    	      this.uniqueItems = defaults.uniqueItems;
    	      this.x_kubernetes_embedded_resource = defaults.x_kubernetes_embedded_resource;
    	      this.x_kubernetes_int_or_string = defaults.x_kubernetes_int_or_string;
    	      this.x_kubernetes_list_map_keys = defaults.x_kubernetes_list_map_keys;
    	      this.x_kubernetes_list_type = defaults.x_kubernetes_list_type;
    	      this.x_kubernetes_map_type = defaults.x_kubernetes_map_type;
    	      this.x_kubernetes_preserve_unknown_fields = defaults.x_kubernetes_preserve_unknown_fields;
    	      this.x_kubernetes_validations = defaults.x_kubernetes_validations;
        }

        public Builder $ref(@Nullable String $ref) {
            this.$ref = $ref;
            return this;
        }

        public Builder $schema(@Nullable String $schema) {
            this.$schema = $schema;
            return this;
        }

        public Builder additionalItems(@Nullable Either<JSONSchemaProps,Boolean> additionalItems) {
            this.additionalItems = additionalItems;
            return this;
        }

        public Builder additionalProperties(@Nullable Either<JSONSchemaProps,Boolean> additionalProperties) {
            this.additionalProperties = additionalProperties;
            return this;
        }

        public Builder allOf(@Nullable List<JSONSchemaProps> allOf) {
            this.allOf = allOf;
            return this;
        }

        public Builder anyOf(@Nullable List<JSONSchemaProps> anyOf) {
            this.anyOf = anyOf;
            return this;
        }

        public Builder $default(@Nullable JsonElement $default) {
            this.$default = $default;
            return this;
        }

        public Builder definitions(@Nullable Map<String,JSONSchemaProps> definitions) {
            this.definitions = definitions;
            return this;
        }

        public Builder dependencies(@Nullable Map<String,Either<JSONSchemaProps,List<String>>> dependencies) {
            this.dependencies = dependencies;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder $enum(@Nullable List<JsonElement> $enum) {
            this.$enum = $enum;
            return this;
        }

        public Builder example(@Nullable JsonElement example) {
            this.example = example;
            return this;
        }

        public Builder exclusiveMaximum(@Nullable Boolean exclusiveMaximum) {
            this.exclusiveMaximum = exclusiveMaximum;
            return this;
        }

        public Builder exclusiveMinimum(@Nullable Boolean exclusiveMinimum) {
            this.exclusiveMinimum = exclusiveMinimum;
            return this;
        }

        public Builder externalDocs(@Nullable ExternalDocumentation externalDocs) {
            this.externalDocs = externalDocs;
            return this;
        }

        public Builder format(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder items(@Nullable Either<JSONSchemaProps,List<JsonElement>> items) {
            this.items = items;
            return this;
        }

        public Builder maxItems(@Nullable Integer maxItems) {
            this.maxItems = maxItems;
            return this;
        }

        public Builder maxLength(@Nullable Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        public Builder maxProperties(@Nullable Integer maxProperties) {
            this.maxProperties = maxProperties;
            return this;
        }

        public Builder maximum(@Nullable Double maximum) {
            this.maximum = maximum;
            return this;
        }

        public Builder minItems(@Nullable Integer minItems) {
            this.minItems = minItems;
            return this;
        }

        public Builder minLength(@Nullable Integer minLength) {
            this.minLength = minLength;
            return this;
        }

        public Builder minProperties(@Nullable Integer minProperties) {
            this.minProperties = minProperties;
            return this;
        }

        public Builder minimum(@Nullable Double minimum) {
            this.minimum = minimum;
            return this;
        }

        public Builder multipleOf(@Nullable Double multipleOf) {
            this.multipleOf = multipleOf;
            return this;
        }

        public Builder not(@Nullable JSONSchemaProps not) {
            this.not = not;
            return this;
        }

        public Builder nullable(@Nullable Boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        public Builder oneOf(@Nullable List<JSONSchemaProps> oneOf) {
            this.oneOf = oneOf;
            return this;
        }

        public Builder pattern(@Nullable String pattern) {
            this.pattern = pattern;
            return this;
        }

        public Builder patternProperties(@Nullable Map<String,JSONSchemaProps> patternProperties) {
            this.patternProperties = patternProperties;
            return this;
        }

        public Builder properties(@Nullable Map<String,JSONSchemaProps> properties) {
            this.properties = properties;
            return this;
        }

        public Builder required(@Nullable List<String> required) {
            this.required = required;
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder uniqueItems(@Nullable Boolean uniqueItems) {
            this.uniqueItems = uniqueItems;
            return this;
        }

        public Builder x_kubernetes_embedded_resource(@Nullable Boolean x_kubernetes_embedded_resource) {
            this.x_kubernetes_embedded_resource = x_kubernetes_embedded_resource;
            return this;
        }

        public Builder x_kubernetes_int_or_string(@Nullable Boolean x_kubernetes_int_or_string) {
            this.x_kubernetes_int_or_string = x_kubernetes_int_or_string;
            return this;
        }

        public Builder x_kubernetes_list_map_keys(@Nullable List<String> x_kubernetes_list_map_keys) {
            this.x_kubernetes_list_map_keys = x_kubernetes_list_map_keys;
            return this;
        }

        public Builder x_kubernetes_list_type(@Nullable String x_kubernetes_list_type) {
            this.x_kubernetes_list_type = x_kubernetes_list_type;
            return this;
        }

        public Builder x_kubernetes_map_type(@Nullable String x_kubernetes_map_type) {
            this.x_kubernetes_map_type = x_kubernetes_map_type;
            return this;
        }

        public Builder x_kubernetes_preserve_unknown_fields(@Nullable Boolean x_kubernetes_preserve_unknown_fields) {
            this.x_kubernetes_preserve_unknown_fields = x_kubernetes_preserve_unknown_fields;
            return this;
        }

        public Builder x_kubernetes_validations(@Nullable List<ValidationRule> x_kubernetes_validations) {
            this.x_kubernetes_validations = x_kubernetes_validations;
            return this;
        }
        public JSONSchemaProps build() {
            return new JSONSchemaProps($ref, $schema, additionalItems, additionalProperties, allOf, anyOf, $default, definitions, dependencies, description, $enum, example, exclusiveMaximum, exclusiveMinimum, externalDocs, format, id, items, maxItems, maxLength, maxProperties, maximum, minItems, minLength, minProperties, minimum, multipleOf, not, nullable, oneOf, pattern, patternProperties, properties, required, title, type, uniqueItems, x_kubernetes_embedded_resource, x_kubernetes_int_or_string, x_kubernetes_list_map_keys, x_kubernetes_list_type, x_kubernetes_map_type, x_kubernetes_preserve_unknown_fields, x_kubernetes_validations);
        }
    }
}
