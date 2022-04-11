// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.waf.SqlInjectionMatchSetArgs;
import io.pulumi.aws.waf.inputs.SqlInjectionMatchSetState;
import io.pulumi.aws.waf.outputs.SqlInjectionMatchSetSqlInjectionMatchTuple;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a WAF SQL Injection Match Set Resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AWS WAF SQL Injection Match Set can be imported using their ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:waf/sqlInjectionMatchSet:SqlInjectionMatchSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:waf/sqlInjectionMatchSet:SqlInjectionMatchSet")
public class SqlInjectionMatchSet extends io.pulumi.resources.CustomResource {
    /**
     * The name or description of the SQL Injection Match Set.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name or description of the SQL Injection Match Set.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
     * 
     */
    @Export(name="sqlInjectionMatchTuples", type=List.class, parameters={SqlInjectionMatchSetSqlInjectionMatchTuple.class})
    private Output</* @Nullable */ List<SqlInjectionMatchSetSqlInjectionMatchTuple>> sqlInjectionMatchTuples;

    /**
     * @return The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
     * 
     */
    public Output</* @Nullable */ List<SqlInjectionMatchSetSqlInjectionMatchTuple>> getSqlInjectionMatchTuples() {
        return this.sqlInjectionMatchTuples;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlInjectionMatchSet(String name) {
        this(name, SqlInjectionMatchSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlInjectionMatchSet(String name, @Nullable SqlInjectionMatchSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlInjectionMatchSet(String name, @Nullable SqlInjectionMatchSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/sqlInjectionMatchSet:SqlInjectionMatchSet", name, args == null ? SqlInjectionMatchSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SqlInjectionMatchSet(String name, Output<String> id, @Nullable SqlInjectionMatchSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/sqlInjectionMatchSet:SqlInjectionMatchSet", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SqlInjectionMatchSet get(String name, Output<String> id, @Nullable SqlInjectionMatchSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlInjectionMatchSet(name, id, state, options);
    }
}
