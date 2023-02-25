package org.black_ixx.playerpoints.locale;

import dev.rosewood.rosegarden.locale.Locale;

import java.util.LinkedHashMap;
import java.util.Map;

public class SpanishChileanLocale implements Locale {
    @Override
    public String getLocaleName() {
        return "es_CL";
    }

    @Override
    public String getTranslatorName() {
        return "Sliide";
    }

    @Override
    public Map<String, Object> getDefaultLocaleValues() {
        return new LinkedHashMap<String, Object>() {{
            this.put("#0", "Plugin Message Prefix");
            this.put("prefix", " &5&l☯ Elixir &7‣ &f");

            this.put("#1", "Currency");
            this.put("currency-singular", "elixir");
            this.put("currency-plural", "elixir");
            this.put("currency-separator", ",");
            this.put("currency-decimal", ".");
            this.put("number-abbreviation-thousands", "k");
            this.put("number-abbreviation-millions", "m");
            this.put("number-abbreviation-billions", "b");

            this.put("#2", "Misc");
            this.put("no-permission", "&cNope!");
            this.put("no-console", "&cOnly players may execute this command.");
            this.put("invalid-amount", "&cEl monto tiene que ser un numero positivo.");
            this.put("unknown-player", "&cNo se encontro el jugador: &d%player%");
            this.put("unknown-command", "&cComando desconocido: &f%input%");
            this.put("votifier-voted", "&eThanks for voting on %service%! &b%amount% &ehas been added to your balance.");
            this.put("leaderboard-empty-entry", "This could be you!");

            this.put("#3", "Base Command Message");
            this.put("base-command-color", "&f");
            this.put("base-command-help", "&7Usa el comando &d/elixir help &7para mas información.");

            this.put("#4", "Help Command");
            this.put("command-help-description", "&8 × &d/elixir help &7‣ &fEste mensaje de ayuda.");
            this.put("command-help-title", "&7Comandos disponibles:");

            this.put("#5", "Give Command");
            this.put("command-give-description", "&8 × &d/elixir give &7‣ &fDar elixir a un jugador.");
            this.put("command-give-usage", "&cUso: &7/elixir give <player> <amount>");
            this.put("command-give-success", "&d%player% &awas given &d%amount% &5%currency%.");
            this.put("command-give-received", "&7Has recibido &d%amount% &5%currency%&7.");

            this.put("#6", "Give All Command");
            this.put("command-giveall-description", "&8 × &d/elixir giveall &7‣ &fDar elixir a todos los jugadores.");
            this.put("command-giveall-usage", "&cUso: &7/elixir giveall <amount> [*]");
            this.put("command-giveall-success", "&aHas dado a todos en linea &d%amount% &ade &5%currency%.");

            this.put("#7", "Take Command");
            this.put("command-take-description", "&8 × &d/elixir take &7‣ &fQuitar elixir de jugador.");
            this.put("command-take-usage", "&cUso: &7/elixir take <player> <amount>");
            this.put("command-take-success", "&7Has quitado un total de &d%amount% &5%currency% a &f%player%&7.");
            this.put("command-take-lacking-funds", "&f%player% &cno tiene %currency% suficiente por lo que cambio a 0!");

            this.put("#8", "Look Command");
            this.put("command-look-description", "&8 × &d/elixir look &7‣ &fVer elixir de un jugador.");
            this.put("command-look-usage", "&cUso: &7/elixir look <player>");
            this.put("command-look-success", "&d%player% &7tiene &d%amount% &7%currency%.");

            this.put("#9", "Pay Command");
            this.put("command-pay-description", "&8 × &d/elixir pay &7‣ &fEnviar elixir a un jugador.");
            this.put("command-pay-usage", "&cUso: &7/elixir pay <player> <amount>");
            this.put("command-pay-sent", "&aHas enviado &d%amount% &5%currency% &aa &f%player%.");
            this.put("command-pay-received", "&f%player% &7te ha enviado &d%amount% &7%currency%&7.");
            this.put("command-pay-lacking-funds", "&cNo tienes suficiente %currency% para eso.");

            this.put("#10", "Set Command");
            this.put("command-set-description", "&8 × &d/elixir set &7‣ &fCambiar elixir del jugador.");
            this.put("command-set-usage", "&cUso: &7/elixir set <player> <amount>");
            this.put("command-set-success", "&aEl %currency% de &f%player% &aahora es &d%amount%&a.");

            this.put("#11", "Reset Command");
            this.put("command-reset-description", "&8 × &d/elixir reset &7‣ &fRestablecer elixir del jugador.");
            this.put("command-reset-usage", "&cUso: &7/elixir reset <player>");
            this.put("command-reset-success", "&aSe ha restablecido el %currency% para &f%player%&a.");

            this.put("#12", "Me Command");
            this.put("command-me-description", "&8 × &d/elixir me &7‣ &fVer tu elixir");
            this.put("command-me-usage", "&cUso: &d/points me");
            this.put("command-me-success", "&7Tienes un total de &d%amount% &7%currency%.");

            this.put("#13", "Lead Command");
            this.put("command-lead-description", "&8 × &d/elixir lead &7‣ &fVer el top.");
            this.put("command-lead-usage", "&cUso: &7/elixir lead [next|prev|#]");
            this.put("command-lead-title", "&7Leaderboard &7(Page #%page%/%pages%)");
            this.put("command-lead-entry", "&d%position%). &7%player% &7‣ &f&6%amount% %currency%");

            this.put("#14", "Broadcast Command");
            this.put("command-broadcast-description", "&8 × &d/elixir broadcast &7‣ &fMostrar a todos la cantidad de elixir de un jugador.");
            this.put("command-broadcast-usage", "&cUso: &7/elixir broadcast <player>");
            this.put("command-broadcast-message", "&f%player% &7tiene &d%amount% &7%currency%.");

            this.put("#15", "Reload Command");
            this.put("command-reload-description", "&8 × &d/elixir reload &7‣ &fRecarga el plugin.");
            this.put("command-reload-usage", "&cUso: &7/elixir reload");
            this.put("command-reload-success", "&aSe recargaron los archivos de configuracion.");

            this.put("#16", "Export Command");
            this.put("command-export-description", "&8 × &d/elixir export &7‣ &fExports the data to storage.yml");
            this.put("command-export-usage", "&cUso: &7/elixir export");
            this.put("command-export-success", "&aSave data has been exported to storage.yml.");
            this.put("command-export-warning", "&cNotice: A storage.yml file already exists. If you would like to overwrite it, use &b/points export confirm&c.");

            this.put("#17", "Import Command");
            this.put("command-import-description", "&8 × &d/elixir import &7‣ &fImports the data from storage.yml");
            this.put("command-import-usage", "&cUso: &7/elixir import");
            this.put("command-import-success", "&aSave data has been imported from storage.yml.");
            this.put("command-import-no-backup", "&cUnable to import, storage.yml does not exist. You can generate one with &b/points export &cand use it to transfer data between database types.");
            this.put("command-import-warning", "&cNotice: This operation will delete all data from the active database and replace it with the contents of storage.yml. " +
                    "&cThe currently active database type is &b&o&l%type%&c. " +
                    "&cIf you are absolutely sure about this, use &b/points import confirm&c.");

            this.put("#18", "Convert Command");
            this.put("command-convert-description", "&8 × &d/elixir convert &7- Loads currency data from another plugin");
            this.put("command-convert-usage", "&cUso: &7/elixir convert <plugin>");
            this.put("command-convert-invalid", "&b%plugin% &cis not a convertible currency plugin name.");
            this.put("command-convert-success", "&aCurrency data from &b%plugin% &ahas been converted.");
            this.put("command-convert-failure", "&cAn error occurred while attempting to convert the data. " +
                    "Please check your console and report any errors to the PlayerPoints plugin author.");
            this.put("command-convert-warning", "&cNotice: This operation will delete all data from the active database and replace it with the data from &b%plugin%&c. " +
                    "&cIf you are absolutely sure about this, use &b/points convert %plugin% confirm&c.");

            this.put("#19", "Import Legacy Command");
            this.put("command-importlegacy-description", "&8 × &d/elixir importlegacy &7- Import a legacy table");
            this.put("command-importlegacy-usage", "&cUso: &7/elixir importlegacy <table>");
            this.put("command-importlegacy-success", "&aSuccessfully imported legacy data from &b%table%&a.");
            this.put("command-importlegacy-failure", "&cFailed to import legacy data from &b%table%&c. Does the table exist?");
            this.put("command-importlegacy-only-mysql", "&cThis command is only available when you have MySQL enabled.");

            this.put("#20", "Comando Version");
            this.put("command-version-description", "&8 × &d/elixir version &7‣ &fVer versión del plugin");
        }};
    }
}
